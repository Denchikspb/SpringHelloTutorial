package springhellotutorial.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Денис on 15.06.2017.
 */
public class Exam {

    private AnswerChecker answerChecker;

    @Autowired
    public Exam(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
    }

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
        System.out.println("we have just set answerChecker using setter");
    }

    public void examCheck(){
        answerChecker.checkAnswer();
    }
}
