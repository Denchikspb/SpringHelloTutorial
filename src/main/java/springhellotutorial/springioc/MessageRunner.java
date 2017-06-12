package springhellotutorial.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Денис on 12.06.2017.
 */
public class MessageRunner {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:message-beans.xml");
        Message message = (Message) context.getBean("printMessage");
        message.setMessage("This is first object");
        System.out.println(message.getMessage());

        Message oneMoreMessage = (Message) context.getBean("printMessage");
        System.out.println(oneMoreMessage.getMessage());
    }
}
