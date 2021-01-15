package com.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="plans")
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Set<com.codegym.model.student> getStudent() {
        return student;
    }

    public void setStudent(Set<com.codegym.model.student> student) {
        this.student = student;
    }

    @OneToMany(targetEntity = student.class)
    private Set<student> student;

    public Plan() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
