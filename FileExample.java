/*
i/o streams:
byte stream: used for audio, video images
--input stream : file input streams, buffered input
--output stream : file output streams, buffered output

character stream: used for text file, characters
--reader : file reader, buffered reader
--writer : file writer, buffered writer

*/


import java.io.*;

public class FileExample {
    public static void main(String[] args) throws IOException{
        File f = new File("test.txt");
        if(f.createNewFile()){
            System.out.println("File Created: " + f.getName());
        }
        else{
            System.out.println("Not able to create file");
        }
    }
}
