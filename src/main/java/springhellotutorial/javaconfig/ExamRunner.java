package springhellotutorial.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by cherepanov on 19.06.2017.
 */
public class ExamRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ExamConfig.class);

        Exam exam = (Exam) context.getBean(Exam.class);
        exam.examChecker();

    }
}
