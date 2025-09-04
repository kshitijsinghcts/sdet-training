package com.example.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/")
    public String home() {
        return "Hello World! This is a simple Spring Boot application.";
    }
}
