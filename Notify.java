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
    @Override
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
    @Override
    void send(){
        System.out.println("Sending SMS to:" + name);
        System.out.println("Message: "+message);
    }
}
//Reference to control access
//object to control behaviour
public class Notify {
    public static void main(String[] args){
       /* //                |-> object at runtime choose behaviour(stored in heap)
        Notification n = new EmailNotification("cvbhjk", "hellooooo");
        //-----------|-> reference to control access(stored in stack)
        n.send();
        n=new SMSNotification("qaz", "welcome");
        n.send();
        */
       Notification[] n = {new EmailNotification("Hats", "Order Confirmed"), 
       new SMSNotification("H-Hats", "Order confirmed now")};
       for(Notification nn : n){
        nn.send();
       }
    }
}
