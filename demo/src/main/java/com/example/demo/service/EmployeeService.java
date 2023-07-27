package com.example.demo.service;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepository;
    public Employee findByUsername(String username){
        return employeeRepository.findByCode(username);
    }
    public boolean authenticate(String username,String password){
        Employee user=findByUsername(username);
        if(user!=null && user.getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
