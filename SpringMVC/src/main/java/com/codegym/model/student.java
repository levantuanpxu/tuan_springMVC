package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;
    private String phone;
    private String address;
    private String gender;

    public com.codegym.model.student getStudent() {
        return student;
    }

    public void setStudent(com.codegym.model.student student) {
        this.student = student;
    }

    @ManyToOne
    @JoinColumn(name = "idstudent")
    private student student;



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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
