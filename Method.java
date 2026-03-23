public class Method {
    long mul(int x, int y){
        return x*y;
    }
    long square(int n){
        return mul(n,n);
    }
    void print(int n){
        System.out.println(square(n));
    }
    void change(Student s){
        s.marks=20;
        System.out.println("Inside method:" + s.marks);
        // value doesnt change cause theres no return statement(primitive data type)
        //if we created an object for the main method, and passed that as an arguemnt, then those values would be changed in the outside method as well
    }
    int changee(int x){
        x=77;
        return x;
    }
    public static void main(String[] args){
        Method m = new Method();
        //int a=50;
        Student s1 = new Student();
        s1.marks=80;
        m.change(s1);
        //m.change(a);
        //System.out.println(m.changee(a));
        System.out.println("Outside the method:" + s1.marks);
    }
}
class Student{
        int marks;
    }
