package com.studentmanagement.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

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

    @NotBlank(message = "Email is required")
    @Email(message = "Please enter a valid email")
    @Column(nullable = false, unique = true)
    private String email;

    @NotNull(message = "Phone number is required")
    @Min(value = 1000000000L, message = "Phone number must be exactly 10 digits")
    @Max(value = 9999999999L, message = "Phone number must be exactly 10 digits")
    private Long phone;


    @NotNull(message = "Age is required")
    @Min(
            value = 1,
            message = "Age must be at least 1"
    )
    @Max(
            value = 150,
            message = "Age cannot be greater than 150"
    )
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
