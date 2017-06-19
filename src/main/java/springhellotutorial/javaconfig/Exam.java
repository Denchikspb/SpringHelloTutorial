package springhellotutorial.javaconfig;

/**
 * Created by cherepanov on 19.06.2017.
 */
public class Exam {
    private AnswerChecker answerChecker;

    public Exam(AnswerChecker answerChecker) {
        System.out.println("Exam constructor");
        this.answerChecker = answerChecker;
    }

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void examChecker(){answerChecker.checkAnswer();}
}
