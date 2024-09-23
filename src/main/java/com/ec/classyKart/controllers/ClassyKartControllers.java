package com.ec.classyKart.controllers;

import com.ec.classyKart.pojos.EmailRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ClassyKartControllers {


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String registerUser() {
        return "register";
    }

    @GetMapping("/forgot-password")
    public String fotgotPassword() {
        return "forgot-password";
    }

//    @PostMapping("/submit-email")
//    public String submitEmail(@RequestBody EmailRequest emailRequest) {
//        System.out.println(emailRequest.getEmail());
//        return "otp-sent";
//    }
}
