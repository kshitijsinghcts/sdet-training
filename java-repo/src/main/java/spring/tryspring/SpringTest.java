package spring.tryspring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.entities.Student;
import spring.entities.TrainingService;

public class SpringTest {
    public static void main(String[] args) {
        // using configurable because the normal one doesn't have close()
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        // picking one of the instance containers in the context container
        Student student = (Student) context.getBean("student1");
        System.out.println(student);
        student.writeExam();

        // picking another
        System.out.println("-".repeat(60));
        TrainingService trainingService = (TrainingService) context.getBean("trainingService");
        trainingService.showDetails();

        // close context container
        context.close();
    }
}
