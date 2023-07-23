package com.example.projectsforfun.firstproject.restendpoints;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoints {

    @Value("${facebook.name}")
    String name;

    @GetMapping("/x")
    public String getName(){

        return name;
    }
}
