package com.ec.ClassyKart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClassyKartControllers {


    @GetMapping("/")
    public String loginPage() {
        return "index";
    }

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }

}
