package com.example.springboot.demo.myApp.Beans;

import org.springframework.stereotype.Component;

@Component
public class BallCoach implements Coach{

    @Override
    public String getDailyWK() {
        return "Ball workout 15 mins";
    }
}
