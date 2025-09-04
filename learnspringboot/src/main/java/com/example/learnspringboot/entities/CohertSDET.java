package com.example.learnspringboot.entities;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CohertSDET implements Cohert {
    public void displayType() {
        System.out.println("This is CohertSDET");
    }
}
