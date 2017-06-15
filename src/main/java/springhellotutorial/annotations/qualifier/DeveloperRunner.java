package springhellotutorial.annotations.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhellotutorial.annotations.required.Developer;

/**
 * Created by Денис on 15.06.2017.
 */
public class DeveloperRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotations-config.xml");

        Position position = (Position) context.getBean("position");

        position.getDevelopersInfo();
    }
}
