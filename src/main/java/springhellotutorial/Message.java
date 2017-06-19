package springhellotutorial;

/**
 * Created by Денис on 12.06.2017.
 */
public class Message {
    private String message;

    public String getMessage() {
        return "Message: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void beanInit(){
        System.out.println("Init bean");
    }

    public void beanDestroy(){
        System.out.println("Destroy bean");
    }

    @Override
    public String toString() {
        return "This is message: " + message;
    }
}
