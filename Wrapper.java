/*Collections - store objects
Wrapper class - (store primitive datatypes as objects in collections) 
                object representation of primitive data type
                present in java.lang

Primitive int - Integer
char - Character
bool - Boolean
float - Float
byte - Byte
long - Long
double - Double

Integer b = new Integer(9); => not used anymore
Integer b = Integer.valueOf(10);
                            |->heap
Autoboxing: int->Integer  => compiler converts during compilation
Unboxing: Integer->int
if Integer X=100, Y=100, then X==Y => True(this follows till 127) ('==' -> compares reference)

int[] arr = new int[] -> Primitive => faster
ArrayList<Integer>list = new ArrayList<>();
list.add(10); // autoboxing
list.get(0); // unboxing
*/

public class Wrapper{
    public static Integer test1(String s){
            return Integer.valueOf(s);
    }
    public static void main(String[] args){
        Integer b = Integer.valueOf("0344444");// return type -> object(Integer)
        Integer c = Integer.parseInt("05678");// return type ->int(int)
        int a=b.intValue(); //Unboxing
        //System.out.println(b);
        Integer X=128;
        X=130;
        System.out.println(X);
        //Integer Y=128;
        //System.out.println(X==Y);//shows true till x==y && x<127&y<127
        //System.out.println(X.equals(Y));//shows true if X==Y
        //System.out.println(test1("123"));
    }
}