/*
 */

import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int mark;
    Student(String name, int mark){
        this.name = name;
        this.mark = mark;
    }
    @Override
    public int compareTo(Student s){
        return this.mark-s.mark;
    }
    @Override
    public String toString(){
        return name + "-" +mark;
    }
}
public class ComparableExample {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("A", 70));
        students.add(new Student("B", 80));
        students.add(new Student("C", 55));
        students.add(new Student("D", 65));
        Collections.sort(students);
        //System.out.println(students);
    }
}
