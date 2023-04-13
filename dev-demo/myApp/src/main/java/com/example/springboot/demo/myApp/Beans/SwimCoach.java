package com.example.springboot.demo.myApp.Beans;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWK() {
        return "Swim exercise";
    }
}
