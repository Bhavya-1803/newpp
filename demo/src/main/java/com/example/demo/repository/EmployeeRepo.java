package com.example.demo.repository;
import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//@Repository
//public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    @Repository
    public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    Employee findByCode(String code);

}