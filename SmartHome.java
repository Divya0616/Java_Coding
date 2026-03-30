/* Smart Home Automation System
if motion is detected -> light on
if temp>30 -> turn on AC
at 7pm -> light on

It shld support 
->Multiple types of devices
->new devices and rules in future

*/
abstract class SmartDevices{
    abstract void turnOn();
    abstract void turnOff();
}
class Light extends SmartDevices{
    @Override
    void turnOn(){
        System.out.println("Light Turned on");
    }
    @Override
    void turnOff(){
        System.out.println("Light Turned off");
    }
}
class AC extends SmartDevices{
    @Override
    void turnOn(){
        System.out.println("AC Turned on");
    }
    @Override
    void turnOff(){
        System.out.println("AC Turned off");
    }
}

interface Trigger{
    boolean isTriggered();
}
class MotionTrigger implements Trigger{
    SmartDevices device;
    MotionTrigger(SmartDevices device){
        this.device = device;
    }
    @Override
    public boolean isTriggered(){
        System.out.println("Motion was Triggered");
        return true;
    }
}
class TimeTrigger implements Trigger{
    SmartDevices device;
    TimeTrigger(SmartDevices device){
        this.device = device;
    }
    @Override
    public boolean isTriggered(){
        System.out.println("Time: 7pm");
        return true;
    }
}
class TemperatureTrigger implements Trigger{
    SmartDevices device;
    TemperatureTrigger(SmartDevices device){
        this.device = device;
    }
    @Override
    public boolean isTriggered(){
        System.out.println("Temperature is above 30 degree celcius");
        return true;
    }
}
interface Action{
    void execute();
}
class TurnOnAction implements Action{
    SmartDevices device;
    TurnOnAction(SmartDevices device){
        this.device = device;
    }
    @Override
    public void execute(){
        device.turnOn();
    }
}
class TurnOffAction implements Action{
    SmartDevices device;
    TurnOffAction(SmartDevices device){
        this.device = device;
    }
    @Override
    public void execute(){
        device.turnOff();
    }
}
class Rule{
    Trigger t;
    Action a;
    Rule(Trigger t, Action a){
        this.t = t;
        this.a = a;
    }
    void result(){
        if(t.isTriggered()) a.execute();
        else System.out.println("Trigger Condition not met");
    }
}
public class SmartHome {
    public static void main(String[] args){

        // Step 1: Create Devices
        SmartDevices light = new Light();
        SmartDevices ac = new AC();

        // Step 2: Create Triggers
        Trigger motionTrigger = new MotionTrigger(light);
        Trigger timeTrigger = new TimeTrigger(light);
        Trigger tempTrigger = new TemperatureTrigger(ac);

        // Step 3: Create Actions
        Action lightOn = new TurnOnAction(light);
        Action acOn = new TurnOnAction(ac);

        // Step 4: Create Rules
        Rule rule1 = new Rule(motionTrigger, lightOn);  // motion -> light ON
        Rule rule2 = new Rule(timeTrigger, lightOn);    // 7pm -> light ON
        Rule rule3 = new Rule(tempTrigger, acOn);       // temp > 30 -> AC ON

        // Step 5: Execute Rules
        rule1.result();
        rule2.result();
        rule3.result();
    }
}
