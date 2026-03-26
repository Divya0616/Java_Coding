/*Polymorphism
Poly - many
morph - forms
one thing -> exisiting in different forms
one method -> existing in different behaviours

TWO TYPES:
Compile time - method overloading => name and parameters are different --- method name, no of parameters, data type of parameters
Runtime - method overriding (only in inheritance)=> name and parameter are same, but they r present in different classes -- 
*/
class Calculator{
    int add(int x, int y){
        return x+y;
    }
    int add(int x, int y, int z){
        return x+y+z;
    }
    double add(double a, double b){
        return a+b;
    }
}
public class Math{
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.add(2,3.0));
        c.add(7,16,25);
        c.add(35.5, 89.7);
    }
}