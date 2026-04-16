import java.io.*;

class Student implements Serializable{
    String name;
    int marks;
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}
public class DeSerialization {
    public static void main(String[] args) throws Exception{
        FileInputStream fi = new FileInputStream("student.txt");
        ObjectInputStream o = new ObjectInputStream(fi);
        while(true){
            try{
                Student s = (Student)o.readObject();
                System.out.println(s.name + " " + s.marks);
            }catch(EOFException e){
                break;
            }
        }
        fi.close();
        o.close();

    }
}
