package com.example.springboot.demo.myApp.Beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BallCoach implements Coach{

    @Override
    public String getDailyWK() {
        return "Ball workout 15 mins";
    }

//    @PostConstruct
//    public void doStartUp() {
//        System.out.println("do start up thing " + getClass().getSimpleName());
//    }
//
//    @PreDestroy
//    public void doCleanUp() {
//        System.out.println("do clean up thing " + getClass().getSimpleName());
//    }

    public BallCoach (){
        System.out.println("Ball Coach initialized");
    }
}
