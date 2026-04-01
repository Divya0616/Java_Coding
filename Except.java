// Checked, Unchecked
// compile time and runtime
/*
throw - manually create an exception
throws - method that gives an exception */

public class Except{
    public static void main(String[] args){
        try{
            // int a=8;
            // int b=0;
            // int c=a/b;
            String s = null;
            System.out.println(s.length());
        }catch(ArithmeticException e){
            System.out.println("Number is divided by zero");
        }
        catch(NullPointerException e){
            System.out.println("String value is null");
        }
        finally{
            System.out.println("Always Executed");
        }
    }
}