package springhellotutorial.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Денис on 13.06.2017.
 */
public class BeanPostProcessorImpl implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization method called for: " + s);
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessAfterInitialization method called for: " + s);
        return o;
    }
}
