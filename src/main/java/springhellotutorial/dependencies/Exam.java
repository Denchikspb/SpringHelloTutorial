package springhellotutorial.dependencies;

/**
 * Created by Денис on 13.06.2017.
 */
public class Exam {
    private AnswerChecker answerChecker;

    public AnswerChecker getAnswerChecker(){
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
        System.out.println("set answerChecker using setter");
    }

    public void examCheck(){
        answerChecker.checkAnswer();
    }
}
