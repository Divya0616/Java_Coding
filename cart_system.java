/*Design Shopping cart System
1. class product - id, name, price(double), quantity
2. constructor
2. Methods - getTotalPrice(), display-> product details
4. atleast 3 product objects
store them in an array(cart)
display all productss
calculate and print grand total
o/p: id, name, price(double), quantity 
grandtotal : xxx
*/
class product{
    int id;
    String name;
    double price;
    int quantity;

    product(int id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

public class cart_system {
    double getTotalPrice(product p){
        return p.price*(double)p.quantity;
    }
    void display(product p){
        System.out.println("Product id: " + p.id);
        System.out.println("Product Name: " + p.name);
        System.out.println("Product price: " + p.price);
        System.out.println("Product quantity: " + p.quantity);
        System.out.println("********************************");
    }
    public static void main(String[] args){
        cart_system cs = new cart_system();
        product p1 = new product(101, "Bags", 50.0, 5);
        product p2 = new product(201, "Shoes", 77.0,7);
        product p3 = new product(301, "Glasses", 100.0, 10);
        
        cs.display(p1);
        cs.display(p2);
        cs.display(p3);
        double grandtotal =  cs.getTotalPrice(p1) + cs.getTotalPrice(p2) + cs.getTotalPrice(p3);
        System.out.println("GrandTotal: " + grandtotal);
    }
}
/*
create an array containing the details of all the products
product[] cart = {p1, p2, p3};

put the display and getTotalPrice methods inside the product class without "p."
to loop thru all of the products with the product datatype, we will use:

for(product p: cart){
    p.display();
}
to get the grandTotal, we will
initialize a variable

double grandTotal = 0.0;

    for(product p: cart){
        p.display();
        grandTotal+=p.getTotalPrice();
    }
        System.out.println(grandTotal);
*/