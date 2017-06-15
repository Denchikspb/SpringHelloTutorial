package springhellotutorial.annotations.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Денис on 15.06.2017.
 */
public class DeveloperRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotations-config.xml");

        Developer developer = (Developer) context.getBean("developer");
        System.out.println(developer);

    }
}
