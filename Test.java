class Student{
    int rollno=16;//instance variables
    String name="aaa";
    int marks=7;
    char gender='F';
    boolean y;
    //Default Constructor
    /*Student(){
        //called everytime an object is created for this particular class 
        System.out.println("From the constructor");
    }*/
    //Parameterized Constructor
    Student(){
        System.out.println("From the Constructor");
    }
    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    Student(int rollno, String name, int marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}

public class Test {
    public static void main(String[] args){
        Student s1 = new Student(1,"tyui"); // s1 -> reference variable
        // new Student() -> creates a object in heap memory => dynamic memory allocation(run time)
        //if we dont use new Student(), we wont be able to initialize the variable s1 => we pass the reference of value
        // whereas in primitive datatype, like int, the value is passed as it is, not a reference to it
        // int a =10; instead of new int(); because of the above reason
            Student s2 = new Student(2, "pokmn");
            Student s3 = new Student(3, "tyhgb");
            System.out.println(s1.name);
        //System.out.println(s1.rollno);
        System.out.println(s2.name);
        System.out.println(s3.name);
        //System.out.println(s1.marks);
        //System.out.println(s1.gender);
        //System.out.println(s1.y);
    }
}
