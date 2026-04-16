/*
Serialization: converting obj into byte streams and storing it in file/database to 
               maintain the state of the object
-- obj->bytestreams->files 
-- java.io.*  => package
*/

import java.io.*;

class Student implements Serializable{
    String name;
    int marks;
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}
class CustomObjectOutputStream extends ObjectOutputStream{
    CustomObjectOutputStream(OutputStream o) throws IOException{
        super(o);
    }
    @Override
    protected void writeStreamHeader(){

    }
}
public class SerializationExample {
    public static void main(String[] args) throws IOException{
        Student s = new Student("XYZ", 44);
        File file = new File("student.txt");
        FileOutputStream fo  = new FileOutputStream(file, true);
        ObjectOutputStream o;
        if(file.length()==0){
            o = new ObjectOutputStream(fo);
        }
        else{
            o = new CustomObjectOutputStream(fo);
        }
        o.writeObject(s);
        fo.close();
        o.close();
    }
}
