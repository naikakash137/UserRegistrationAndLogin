package com.restdemo.loginapp.controller;

import com.restdemo.loginapp.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private final WelcomeService welcomeservice;

    @Autowired
    public WelcomeController(WelcomeService welcomeService){
        this.welcomeservice=welcomeService;
    }

    @GetMapping("/welcome")
    public String homePage(){
        return welcomeservice.getWelcomeMessage();
    }

//    @GetMapping("/menu")
//    public String welcomeHomePage(){
//        return "This is the Menu";
//    }
}
