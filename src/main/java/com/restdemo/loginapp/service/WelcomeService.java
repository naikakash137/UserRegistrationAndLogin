package com.restdemo.loginapp;

import org.springframework.stereotype.Service;


//this is the service layer
@Service
public class WelcomeService {
    public String getWelcomeMessage(){
        return "Welcome to the spring boot rest API";
    }
}
