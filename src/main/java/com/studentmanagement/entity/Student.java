package com.studentmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }

    public Student(Long id, String name, String email, Long phone, Integer age, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.department = department;
    }

    @Column(nullable = false)
    private String name;

    @Column(nullable = false ,unique = true)
    private String email;

    private Long phone;

    private Integer age;

    private String department;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Long getPhone() {
        return phone;
    }

    public Integer getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
