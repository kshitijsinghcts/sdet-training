package com.example.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnspringbootApplication {

	public static void main(String[] args) {
		// make this app a container
		ConfigurableApplicationContext app = SpringApplication.run(LearnspringbootApplication.class, args);
		// close the container
		app.close();
	}

}
