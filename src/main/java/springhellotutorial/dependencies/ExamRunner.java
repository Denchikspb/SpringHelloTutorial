package springhellotutorial.dependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Денис on 13.06.2017.
 */
public class ExamRunner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("exam-config.xml");

        Exam exam = (Exam) context.getBean("exam");
        exam.examCheck();
    }
}
