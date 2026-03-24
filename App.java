class User{
    String name;
    String phone;
    String address;
    String role = "user";
    User(){
        System.out.println("By using super");
    }
    User(String name){
        this.name = name;
        System.out.println("From User class");
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Role: "+role);
    }
}
//Inheritance : child class/sub class inherits properties from its parent class/super class using extends Keyword
//Parent class always executes first
//Inheritance follows "IS A" relationship
class Driver extends User{
    String role = "Driver";
    String vehicle;
    Driver(String name, String vehicle){
        super(name);
        this.vehicle = vehicle;
        //System.out.println("Name: "+name);
        //System.out.println("Role: "+role);
    }
    void displayDriver(){
        super.display();
        System.out.println("Vehicle: "+ vehicle);
        System.out.println("Driver class role: " + role);
        System.out.println("User class role: "+ super.role);
    }
}
class FoodUser extends User{
    String favouriteFood;
    FoodUser(){
        System.out.println("From FoodUser Class");
    }
}

class Traveller extends User{
    String preferredVehicle;
    Traveller(){
        System.out.println("From Traveller Class");
    }
}

public class App{
    public static void main(String[] args){
        Driver d = new Driver("WERT", "Bike");
        d.displayDriver();
    }
}
