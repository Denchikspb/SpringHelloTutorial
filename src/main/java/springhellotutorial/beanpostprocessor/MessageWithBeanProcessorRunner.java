package springhellotutorial.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhellotutorial.Message;

/**
 * Created by Денис on 13.06.2017.
 */
public class MessageWithBeanProcessorRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("post-processor-config.xml");

        Message message = (Message) context.getBean("message");
        System.out.println("\n====================");
        System.out.println(message.getMessage());
        System.out.println("====================\n");
        context.registerShutdownHook();
    }
}
