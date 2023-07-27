package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public User showDetails(String empId){
        User user = userRepo.findByEmployeeid(empId);
        //User user=userRepo.findByCode(username);
        return user;
    }

}
