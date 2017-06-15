package springhellotutorial.annotations.autowired;

/**
 * Created by Денис on 15.06.2017.
 */
public class AnswerChecker {
    public AnswerChecker() {
        System.out.println("AnswerChecker init");
    }

    public void checkAnswer() {
        System.out.println("Now we are check answer");
    }
}
