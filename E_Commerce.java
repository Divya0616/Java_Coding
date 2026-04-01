/*Task: E_Commerce Order System
Design System where user places an order, while ordering system must handle 
failures using Exception Handling
1.Product out of stock
2.Payment failed
3.Order processing Failed

CLASSES:
Product(name, stock, price)
user(name, address)
order(Product, user, Quantity)
OrderService
PlaceOrder(Order)
 */
import java.lang.Math;
class ProductOutOfStockException extends Exception{
    ProductOutOfStockException(String msg){
        super(msg);
    }
}
class PaymentFailedException extends Exception{
    PaymentFailedException(String msg){
        super(msg);
    }
}
class OrderProcessingFailedException extends Exception{
    OrderProcessingFailedException(String msg){
        super(msg);
    }
}
class Product{
    String p_name;
    int stock;
    double price;
    Product(String p_name, int stock, double price){
        this.p_name = p_name;
        this.stock = stock;
        this.price = price;
    }
}
class User{
    String u_name;
    String address;
    User(String u_name, String address){
        this.u_name = u_name;
        this.address = address;
    }
}
class Order{
    Product p;
    User u;
    int quantity;
    Order(Product p, User u, int quantity){
        this.p = p;
        this.u = u;
        this.quantity  =  quantity;
    }
}
class OrderService{
    void placeOrder(Order o) throws ProductOutOfStockException, PaymentFailedException, 
    OrderProcessingFailedException
    {
        if(o.p.stock<=0){
            throw new ProductOutOfStockException("Product is Out of Stock");
        }
        if(Math.random()<0.4){
            throw new PaymentFailedException("Payment has Failed");
        }
        if(o.quantity>o.p.stock){
            throw new OrderProcessingFailedException("Order Processing has Failed");
        }
        else{
            o.p.stock -= o.quantity;
            System.out.println("Order Placed Successfully"); 
        }
    }
}
public class E_Commerce {
    
    public static void main(String[] args){
        Product p = new Product("Bags", 1000, 700);
        User u = new User("WRFTED", "Chennai");
        Order o = new Order(p, u, 5);
        OrderService s = new OrderService();
        try{
            s.placeOrder(o);
        }
        catch(ProductOutOfStockException e1){
            System.out.println(e1.getMessage());
        }
        catch(PaymentFailedException e2){
            System.out.println(e2.getMessage());
        }
        catch(OrderProcessingFailedException e3){
            System.out.println(e3.getMessage());
        }
    }
}
