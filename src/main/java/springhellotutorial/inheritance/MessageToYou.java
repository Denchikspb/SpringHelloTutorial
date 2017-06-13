package springhellotutorial.inheritance;

/**
 * Created by Денис on 13.06.2017.
 */
public class MessageToYou {
    private String message;
    private String messageToYou;

    public String getMessage() {
        return "This is simple message: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageToYou() {
        return "And this message is special for you" + messageToYou;
    }

    public void setMessageToYou(String messageToYou) {
        this.messageToYou = messageToYou;
    }

}
