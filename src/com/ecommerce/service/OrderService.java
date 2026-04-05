package src.com.ecommerce.service;
import src.com.ecommerce.model.*;
public class OrderService {
    public void placeOrder(Order o){
        System.out.println("User name: " + o.u.name);
        System.out.println("Product name: " + o.p.p_name);
        System.out.println("Quantity: " + o.quantity);
        double totalPrice = o.p.price * o.quantity;
        System.out.println("Total Price: " + totalPrice);
    }

}
