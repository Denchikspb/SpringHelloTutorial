package springhellotutorial.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cherepanov on 19.06.2017.
 */
@Configuration
public class ExamConfig {

    @Bean
    public Exam exam(){
        return new Exam(answerChecker());
    }

    @Bean
    public AnswerChecker answerChecker(){
        return new AnswerChecker();
    }

}
