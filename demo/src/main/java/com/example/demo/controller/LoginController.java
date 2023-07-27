package com.example.demo.controller;

import com.example.demo.entity.User;

import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;
import com.example.demo.service.EmployeeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepo userRepo;
    @GetMapping("/")
    public String showLoginForm() {
        return "index";
    }
 @PostMapping("/login")
 public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session){
     if(employeeService.authenticate(username, password)){
         User userdata = userRepo.findByEmployeeid(username);
         if(userdata != null){
          session.setAttribute("userdata",userdata);
         }
         return "redirect:/home";
     }
     return "redirect:/login?error";
 }
@GetMapping("/home")
public String showHomePage(HttpSession session){
        System.out.println(session.getAttribute("userdata"));
     User userdata=(User) session.getAttribute("userdata");
     String ecode = userdata.getEmployeeid();
     System.out.println(ecode);

     return "home";
}

}

