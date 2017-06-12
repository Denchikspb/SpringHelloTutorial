package springhellotutorial.helloworld;

/**
 * Created by Денис on 05.06.2017.
 */
public class SpringHelloWorld {
    private String helloMessage;

    public void getHelloMessage() {
        System.out.println("Hello message: " + helloMessage);
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }
}
