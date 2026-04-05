package src.com.ecommerce.main;
import src.com.ecommerce.model.*;
import src.com.ecommerce.service.OrderService;

public class Mainn {
    public static void main(String[] args){
        Product product = new Product("Keyboard", 7160);
        User user = new User("Test_User", "Dubai");
        Order order = new Order(product,user, 4);
        OrderService service = new OrderService();
        service.placeOrder(order);
    }
}
