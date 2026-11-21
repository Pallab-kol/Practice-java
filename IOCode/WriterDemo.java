package IOCode;
import java.io.*;
public class WriterDemo {
    public static void main(String[] args) {
        try {
            Writer w = new FileWriter("newFile.txt", true);     //initially it is false if not declared true
            System.out.println("Writing character: ");   //which will result overriding in file
            w.write(87);
            w.write("\nthis is a test file for WriterDemo.java.");
            w.close();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
