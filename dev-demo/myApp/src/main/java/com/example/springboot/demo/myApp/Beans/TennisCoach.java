package com.example.springboot.demo.myApp.Beans;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWK() {
        return "Tennis Workout!";
    }

    public TennisCoach () {
        System.out.println("tennis coach initialized");
    }
}
