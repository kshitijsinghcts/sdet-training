package com.example.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.learnspringboot.entities.TrainingService;

@SpringBootApplication
public class LearnspringbootApplication {

	public static void main(String[] args) {
		// make the spring application
		ApplicationContext app = SpringApplication.run(LearnspringbootApplication.class, args);
		// get the container
		TrainingService trainingService = app.getBean(TrainingService.class);
		// use the container
		trainingService.showDetails();
	}

}
