package spring.tryspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.entities.Student;

@Configuration
public class JavaConfig {
    @Bean
    public Student getStudent() {
        return new Student(25);
    }
}