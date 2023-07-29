package com.example.projectsforfun.firstproject;

import com.example.projectsforfun.firstproject.dto.Coach;
import com.example.projectsforfun.firstproject.dto.SwimmingCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachConfiguration {

    @Bean
    Coach getSwimmingCoach(){

        return new SwimmingCoach();
    }
}
