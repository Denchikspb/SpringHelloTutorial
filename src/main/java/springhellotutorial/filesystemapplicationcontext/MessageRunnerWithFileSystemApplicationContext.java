package springhellotutorial.filesystemapplicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Денис on 12.06.2017.
 */
public class MessageRunnerWithFileSystemApplicationContext {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("D:/Develop/SpringHelloTutorial/src/main/resources/message-bean.xml");
        Message message = (Message)context.getBean("fromBeanMessage");
        System.out.println(message.getMessage());
    }
}
