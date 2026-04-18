@FunctionalInterface // when we declare this, only one method can be inside
interface Math{
    int add(int a, int b);
}
@FunctionalInterface
interface Exercise{
    void sayHello();
}
public class LambdaExample {
    public static void main(String[] args){
        /*Math m = new Math(){
            @Override
            public int add(int a, int b){
                return a+b;
            }
        };*/
        Math obj=(a,b)-> a+b; // (a,b) => a+b; //Lambda Expression
        /*Exercise e = new Exercise(){
            @Override
            public void sayHello(){
                System.out.println("Hello");
            }
        };
        */
       Exercise e = () -> {System.out.println("Hello");}; //Lambda Expression
        System.out.println(obj.add(22,33));
        e.sayHello();
    }
}
/*
Another way to write the lambda Expression:
Math obj=(a,b) -> {
            System.out.println("Adding two numbers.......");
            return a+b;
        };*/