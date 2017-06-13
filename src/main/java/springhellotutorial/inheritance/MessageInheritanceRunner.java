package springhellotutorial.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhellotutorial.Message;

/**
 * Created by Денис on 13.06.2017.
 */
public class MessageInheritanceRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("inheritance-message-config.xml");

        Message message = (Message) context.getBean("message");
        System.out.println("First bean: ");
        System.out.println(message.getMessage());

        System.out.println("\n=================");
        MessageToYou messageToYou = (MessageToYou)context.getBean("messageToYou");
        System.out.println("Second bean: ");
        System.out.println(messageToYou.getMessage());
        System.out.println(messageToYou.getMessageToYou());

    }
}
