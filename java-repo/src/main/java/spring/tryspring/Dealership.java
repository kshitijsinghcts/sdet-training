package spring.tryspring;

import spring.entities.Motorcycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dealership {
    public static void main(String[] args) {
        // define source
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("dealershipConfig.xml");
        // select object
        Motorcycle selectedMotorcycle = (Motorcycle) context.getBean("motorcycle1");
        System.out.println(selectedMotorcycle);
        context.close();
    }
}
