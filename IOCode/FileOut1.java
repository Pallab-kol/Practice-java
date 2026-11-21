package IOCode;
import java.io.*;

public class FileOut1 {
    public static void main(String[] args)
    {
        String data = "Test file for FieOut.java.";
        String d2 = " It won't override data";
        String s = System.getProperty("user.dir");

        // Print the current directory
        System.out.println("Current working directory: " + s);

        try (FileOutputStream fos = new FileOutputStream("new.txt", false)) {
                 
            // Convert the string into bytes
            byte[] b = data.getBytes();

            // Write the bytes to the file
            fos.write(b);
            fos.write(d2.getBytes());

            System.out.println("Data successfully written to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println();
        try (FileInputStream f = new FileInputStream("new.txt")){
            int ch;
            while ((ch = f.read())!=-1) {
                System.out.print((char)ch);
            }
            f.close();
            
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println();
    }
}