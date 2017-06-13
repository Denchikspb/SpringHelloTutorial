package springhellotutorial.springioc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhellotutorial.Message;

/**
 * Created by Денис on 12.06.2017.
 */
public class MessageRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:message-beans.xml");
        Message message = (Message) context.getBean("printMessage");
        System.out.println(message.getMessage());

        context.registerShutdownHook();
    }
}
