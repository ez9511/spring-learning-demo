package com.example.springboot.demo.myApp.configuration;

import com.example.springboot.demo.myApp.Beans.Coach;
import com.example.springboot.demo.myApp.Beans.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("agua")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
