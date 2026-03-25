//Multiple Booking Platform
/*RideBooking, Food Delivery, Parcel Delivery
Requirement:

All users share common details but each service has specialized users
user(name, phone, location) displayInfo()
rideuser- vehicletype displayRide
food-favfood, parceluser-parcelweight
*/
// Base Class
class User {
    String name;
    String phone;
    String location;

    // Constructor
    User(String name, String phone, String location) {
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Location: " + location);
    }
}

// Derived Class - Ride User
class RideUser extends User {
    String vehicleType;

    RideUser(String name, String phone, String location, String vehicleType) {
        super(name, phone, location); // calls parent constructor
        this.vehicleType = vehicleType;
    }

    void displayRide() {
        displayInfo();
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

// Derived Class - Food User
class FoodUser extends User {
    private String favFood;

    FoodUser(String name, String phone, String location, String favFood) {
        super(name, phone, location);
        this.favFood = favFood;
    }

    void displayFood() {
        displayInfo();
        System.out.println("Favorite Food: " + favFood);
    }
}

// Derived Class - Parcel User
class ParcelUser extends User {
    private double parcelWeight;

    ParcelUser(String name, String phone, String location, double parcelWeight) {
        super(name, phone, location);
        this.parcelWeight = parcelWeight;
    }

    void displayParcel() {
        displayInfo();
        System.out.println("Parcel Weight: " + parcelWeight + " kg");
    }
}

public class MultiUse {
    public static void main(String[] args) {

        RideUser r = new RideUser("Divya", "9876543210", "Chennai", "Bike");
        FoodUser f = new FoodUser("Aishu", "9123456780", "Coimbatore", "Pizza");
        ParcelUser p = new ParcelUser("Kumar", "9988776655", "Madurai", 2.5);

        System.out.println("\n--- Ride Booking ---");
        r.displayRide();

        System.out.println("\n--- Food Delivery ---");
        f.displayFood();

        System.out.println("\n--- Parcel Delivery ---");
        p.displayParcel();
    }
}