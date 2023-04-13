package com.example.springboot.demo.myApp.rest;

import com.example.springboot.demo.myApp.Beans.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    private Coach myCoach;

    private Coach tennisCoach;

    private Coach anotherCoach;

    private Coach swimCoach;

    @Autowired
    public FunRestController(@Qualifier("ballCoach") Coach theCoach, @Qualifier("tennisCoach")Coach Coach, @Qualifier("basketCoach") Coach anotherCoach) {
        System.out.println("Fun rest controller initialized");
        this.myCoach = theCoach;
        this.tennisCoach = Coach;
        this.anotherCoach = anotherCoach;
    }

    @Autowired
    public void setSwimCoach(@Qualifier("agua") Coach coach) {
        this.swimCoach = coach;
    }

//    @Autowired
//    public void setMyCoach(@Qualifier("ballCoach")Coach theCoach){
//        this.myCoach = theCoach;
//    }
//
//    @Autowired
//    public void setTennisCoach(@Qualifier("tennisCoach")Coach theCoach){
//        this.tennisCoach = theCoach;
//    }
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

    @GetMapping("/tennis")
    public String tennisWork() {
        return tennisCoach.getDailyWK();
    }

    @GetMapping("/basket")
    public String basketWork() {
        return anotherCoach.getDailyWK();
    }

    @GetMapping("/check")
    public String checkScope() {
        return "check scope equality " + (myCoach == anotherCoach);
    }
}
