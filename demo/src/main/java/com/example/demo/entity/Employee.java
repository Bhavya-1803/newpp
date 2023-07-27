package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name="code")
    private String code;
    @Column(name="password")
    private String password;

    public Employee() {
    }

    public Employee(String password) {

        this.password = password;
    }


    public String getCode() {
        return code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
