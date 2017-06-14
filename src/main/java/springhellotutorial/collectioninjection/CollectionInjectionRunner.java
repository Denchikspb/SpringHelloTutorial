package springhellotutorial.collectioninjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Денис on 14.06.2017.
 */
public class CollectionInjectionRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collection-injection-config.xml");

        CollectionInjection coll = (CollectionInjection) context.getBean("collectionInjection");
        coll.getDocumentList();
        coll.getDocumentSet();
        coll.getDocumentMap();
        coll.getDocumentProp();
    }
}
