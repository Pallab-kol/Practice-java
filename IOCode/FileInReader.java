package IOCode;

import java.io.*;

public class FileInReader {

    public static void main(String[] args)
    {
        try(Reader r = new FileReader("file2.txt")) {
          
            // Create a FileReader object which is a subclass of Reader
            

            // Read one character at a time from the file
            /*int data = r.read();    //reading first data
            while (data != -1) {
              
                // Convert the int to char and print
                System.out.print((char)data);   //printing data
                data = r.read();    //updating for next value
            }*/
           //reading file as array format
            char[] c = new char[100];
            r.read(c);
            System.out.println(c);
            // Close the reader
            r.close();
        }
        catch (Exception ex) {
          System.out.println("An error occurred: " + ex.getMessage());
        }
    }
}