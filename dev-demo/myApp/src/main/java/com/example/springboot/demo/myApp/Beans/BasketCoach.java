package com.example.springboot.demo.myApp.Beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BasketCoach implements Coach{
    @Override
    public String getDailyWK() {
        return "Basketball workout";
    }

    public BasketCoach() {
        System.out.println("basket coach initialized");
    }
}
