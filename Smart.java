/*Abstraction - hiding internal implementation and showing only external implementation

Two types of implementation: 
abstract class - partial abstraction
interface - complete abstraction => always "public" + abstract method

                stack           heap
SmartDevice     device          new SmartDevice() X
                (reference type)   new Light() 

Abstract method - must override in child class
concrete method - will be inherited automatically

we can acheive multiple inheritance only through interface
one child class with multiple behaviour without ambiguity in overriding the methods

Abstraction - HAS A relationship
                |-> object created inside another object
                Two Types : 
                1)Composition - tightly coupled => child object doesnt exist w/o parent object
                2)Aggregation - weakly coupled => both can work independently
Coupling - how much one class depends on another class
Cohesion - how much of the responsibilities of class belong together
two types of cohesion - high and low
two types of coupling - tight and loose

loose coupling and high cohesion - best
*/

abstract class SmartDevice{
    abstract void on();
    abstract void off();
    void deviceInfo(){
        System.out.println("It is a device");
    }
}
class Light extends SmartDevice{
    @Override
    void off(){
        System.out.println("Lights off");
    }
    @Override
    void on(){
        System.out.println("Lights on");
    }
}
interface Remote{
    void change();
}
interface WifiControl{
    void connect();
    void change();
}

class TV implements Remote,WifiControl{
    @Override
    public void change(){
        System.out.println("Change channels");
    }
    @Override
    public void connect(){
        System.out.println("Wifi Connected");
    }
}
public class Smart{
    public static void main(String[] args){
        //Remote r = new TV();
        //r.change();
        /*SmartDevice dev = new Light();
        dev.off();
        dev.on();
        dev.deviceInfo();
        */
    }
}