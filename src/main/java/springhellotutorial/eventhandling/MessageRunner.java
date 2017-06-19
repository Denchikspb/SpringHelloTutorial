package springhellotutorial.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhellotutorial.Message;

/**
 * Created by cherepanov on 19.06.2017.
 */
public class MessageRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("message-event-handling-config.xml");

        context.start();

        Message message = (Message) context.getBean("message");
        System.out.println(message);
        context.stop();
    }
}
