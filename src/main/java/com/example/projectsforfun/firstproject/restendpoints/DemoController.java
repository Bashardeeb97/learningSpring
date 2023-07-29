package com.example.projectsforfun.firstproject.restendpoints;

import com.example.projectsforfun.firstproject.dto.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.constant.Constable;

@RestController
public class DemoController {

    private Coach coach;

    public DemoController(Coach coach,@Qualifier("getSwimmingCoach") Coach coach2){

        System.out.println("s"+coach.getCoachNme());
        System.out.println("y"+coach2.getCoachNme());

    }

    @Autowired
    public void setCoach(@Qualifier("golfCoach") Coach coach) {
        System.out.println("x"+coach.getCoachNme());

        this.coach = coach;
    }

    @GetMapping(path = "/xy")
    String getCoachName(){

        return coach.getCoach().getCoachNme();
    }
}
