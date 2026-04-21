import java.util.*;
class Employee{
    String name;
    int salary;
    Employee(String name, int salary){
        this.name = name;
        this.salary=salary;
    }
    public String getName(){return name;}
    public int getSalary(){return salary;}
    @Override
    public String toString(){
        return name+" "+salary;
    }
}
public class StreamsExample{
    public static void main(String[] args){
        //map
        List<Integer> n = List.of(2,3,4,5,6);
        List<Integer> multiplyby2=n.stream().map((i)->i*2).
        toList();
        System.out.println(multiplyby2);
        List<Integer> evenNums = n.stream().filter((i)->i%2==0).toList();
        int total = multiplyby2.stream().reduce(0, (a,b)->a+b);
        System.out.println(evenNums);
        System.out.println(total);
        List<Employee> e = List.of(new Employee("Employee1", 29000), 
        new Employee("Employee2", 65000));
        List<String> EmployeeNames = e.stream().map((i)->i.getName()).toList();
        List<String> greaterSalary = e.stream().filter((i)->i.getSalary()>30000).
        toString().toList();
        System.out.println(EmployeeNames);
        System.out.println(greaterSalary);
    }
}
/*List<String> greaterSalary = e.stream()
    .filter((i) -> i.getSalary() > 30000)
    .map((i) -> String.valueOf(i.getSalary()))
    .toList(); */