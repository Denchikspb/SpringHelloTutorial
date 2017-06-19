package aop;

/**
 * Created by cherepanov on 19.06.2017.
 */
public class Logging {
    public void beforeAdvice(){
        System.out.println("Now wa are going to initiate developer`s profile");
    }

    public void afterAdvice(){
        System.out.println("Developer`s profile has been init");
    }

    public void afterReturningAdvice(Object someValue){
        System.out.println("Value: " + someValue.toString());
    }

    public void inCaseOfExceptionThrowAdvice(ClassCastException e){
        System.out.println("We have an exception here: " + e.toString());
    }
}
