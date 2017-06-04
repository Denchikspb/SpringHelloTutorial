package springhellotutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Денис on 05.06.2017.
 */
public class SpringHelloWorldRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-hello-bean.xml");
        SpringHelloWorld springHelloWorld = (SpringHelloWorld)context.getBean("springHello");
        springHelloWorld.getHelloMessage();
    }
}
