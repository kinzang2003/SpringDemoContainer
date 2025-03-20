package bt.edu.gcit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Alien alien = new Alien();
        // alien.code(); 

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //creates a container

        // Alien obj = (Alien) context.getBean("alien"); //creates a variable to store type alien, get the bin which is registered as alien
        Alien obj = context.getBean("alien", Alien.class);
        // obj.code();
        // System.out.println(obj.getAge());

        // Alien obj1 = (Alien) context.getBean("alien"); //creates
        // obj1.code();
    }
}