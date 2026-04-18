import java.util.function.*;
class Student{
    String name;
    int marks;
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}
public class PredicateExample {
    public static void main(String[] args){
        Predicate<Integer> isEven = (n) -> n%2==0;
        Predicate<Student> isPass = (s) -> s.marks>45;
        System.out.println(isPass.test(new Student("WER", 44)));
        System.out.println(isEven.test(99998));
    }
}
