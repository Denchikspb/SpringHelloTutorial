package springhellotutorial.eventhandling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by cherepanov on 19.06.2017.
 */
public class MyStopEventHandler implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("Context stop event...");
    }
}
