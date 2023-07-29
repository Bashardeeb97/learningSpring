package com.example.projectsforfun.firstproject.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import sf.TennisCoach;

@Component
@Primary
public class CricketCoach implements Coach {


    private final TennisCoach tennisCoach;

    public TennisCoach getCoach() {
        return tennisCoach;
    }

    @Autowired
    public CricketCoach(TennisCoach tennisCoach) {
        this.tennisCoach=tennisCoach;
    }

    @Override
    public String getCoachNme() {
        return "CricketCoach";
    }
}
