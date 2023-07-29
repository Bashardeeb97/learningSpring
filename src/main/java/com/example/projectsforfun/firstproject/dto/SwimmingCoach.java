package com.example.projectsforfun.firstproject.dto;

public class SwimmingCoach implements Coach{
    @Override
    public String getCoachNme() {
        return "SwimmingCoach";
    }

    @Override
    public Coach getCoach() {
        return null;
    }
}
