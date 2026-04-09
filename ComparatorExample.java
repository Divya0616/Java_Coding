
/*comparator - creating sorting logic externally - outside the class
--compare() method */
import java.util.*;
class Student{
    int id;
    String name;
    int mark;
    Student(int id, String name, int mark){
        this.id=id;
        this.name = name;
        this.mark = mark;
    }
}

public class ComparatorExample{
    public static void main(String[] args){
        List<Student> stu = new ArrayList<>();
        stu.add(new Student(3,"X",20));
        stu.add(new Student(5,"u",80));
        stu.add(new Student(1,"a",40));
        stu.add(new Student(2,"f",56));
        stu.add(new Student(4,"w",78));
        Comparator<Student> byId= new Comparator<Student>(){
            @Override
            public int compare(Student a, Student b){
                return a.id-b.id;
            }
        };
        Collections.sort(stu, byId);
        //using lambda expression - (a,b)->a.mark-b.mark instead of byId in above line
        System.out.println(stu);
        Collections.sort(stu, (a,b)->a.mark-b.mark);
        System.out.println(stu);
    }
}