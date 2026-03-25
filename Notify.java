class Notification{
    String name;
    String message;
    Notification(String name, String message){
        this.name = name;
        this.message = message;
        System.out.println("This is from the Parent class Constructor");
    }
    void send(){
        System.out.println("Sending Notifications");
    }
}
class EmailNotification extends Notification{
    EmailNotification(String name, String message){
        super(name, message);
    }
    void send(){
        System.out.println("Sending Email to: "+ name);
        System.out.println("Message: "+message);
    }
    void changeReceiverEmail(){
        System.out.println("Changed Receiver Email");
    }
}
class SMSNotification extends Notification{
    SMSNotification(String name, String message){
        super(name, message);
    }
    void send(){
        System.out.println("Sending SMS to:" + name);
        System.out.println("Message: "+message);
    }
}
//Reference to control access
//object to control behaviour
public class Notify {
    public static void main(String[] args){
        //                |-> object at runtime choose behaviour
        Notification n = new EmailNotification("cvbhjk", "hellooooo");
        //-----------|-> reference to control access
        n.send();
        n=new SMSNotification("qaz", "welcome   a");
        n.send();
    }
}
