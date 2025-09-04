package com.example.learnspringboot.entities;

import org.springframework.stereotype.Component;

@Component
public class CohertJava implements Cohert {
    public void displayType() {
        System.out.println("CohertJava");
    }
}
