package src.com.ecommerce.model;

public class Order {
    public Product p;
    public User u;
    public int quantity;
    public Order(Product p, User u, int quantity){
        this.p = p;
        this.u = u;
        this.quantity = quantity;
    }
}
