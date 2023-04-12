package com.example.springboot.demo.myApp.rest;

import com.example.springboot.demo.myApp.Beans.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    private Coach myCoach;

    @Autowired
    public FunRestController(Coach theCoach) {
        this.myCoach = theCoach;
    }
    @Value("${coach.name}")
    private String name;
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String workout() {
        return name + " " + myCoach.getDailyWK();
    }

    @GetMapping("/fortune")
    public String fortune() {
        return "today is our lucky day!";
    }
}
