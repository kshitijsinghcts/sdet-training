package spring.tryspring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.entities.Student;

public class SpringTestWithAnnotation {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student studentObject = context.getBean("getStudent", Student.class);
        System.out.println(studentObject);
        context.close();
    }
}
