/*
Employee(name, dept, salary, age)
            (dev, HR, Support)

1. Filter by dept("Dev")
2.Salary greater than 50k
3.Total salary using sum() method
4.Average salary using average() method
5.Count of Employee using count() method

 */

import java.util.List;

class Employee{
    String name;
    String dept;
    int salary;
    int age;
    Employee(String name, String dept, int salary, int age){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
    }
    public String getDept(){return dept;}
    public int getSalary(){return salary;}
}
public class StreamTask{
    public static void main(String[] args){
        List<Employee> e = List.of(new Employee("Employee1","Dev", 25000, 25), 
        new Employee("Employee2", "HR", 65000, 47), 
        new Employee("Employee3", "Support", 100000, 35));
        List<String> e1 = e.stream().filter((i)->i.getDept()=="Dev").toList();
        List<String> greaterSalary = e.stream().filter((i)->i.getSalary()>50000).toString()
        toList();
        System.out.println(e1);
        System.out.println(greaterSalary);
    }
}