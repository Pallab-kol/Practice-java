package IOCode;
import java.io.*;

public class FileOut2 {
    public static void main(String[] args) {

        String s = System.getProperty("user.dir");

        // Print the current directory
        System.out.println("Current working directory: " + s);

        // Use try-with-resources to ensure the stream is closed automatically
        try (FileOutputStream fout = new FileOutputStream("name3.txt", false)) { 

            // String to be written to the file
            String st = "TATA, Test file for name3.txt.";
            //String st2 = "It will override data.";

            // Convert the string to a byte array and write it directly
            fout.write(st.getBytes());
            //fout.write(st2.getBytes());   //comment previous line and uncomment this to override file data

        } catch (IOException e) {
            
            // Handle exceptions if file operations fail
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}