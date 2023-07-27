package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employeeid")
    private String employeeid;
    @Column(name="e_name")
    private String e_name;
    @Column(name="e_design")
    private String e_design;
    @Column(name="e_location")
    private String e_location;

    public User(String empId, String e_name, String e_design, String e_location) {
        this.employeeid = empId;
        this.e_name = e_name;
        this.e_design = e_design;
        this.e_location = e_location;
    }

    public String getEmployeeid() { return employeeid; }

    public void setEmployeeid(String empId) {
        this.employeeid = empId;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getE_design() {
        return e_design;
    }

    public void setE_design(String e_design) {
        this.e_design = e_design;
    }

    public String getE_location() {
        return e_location;
    }

    public void setE_location(String e_location) {
        this.e_location = e_location;
    }
}
