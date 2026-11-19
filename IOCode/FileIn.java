package IOCode;
import java.io.*;

public class FileIn{
    
    public static void main(String[] args){
        
        // Use try-with-resources to automatically close the
        // stream
        try (FileInputStream fi
             = new FileInputStream("file1.txt")) {

            // Display file channel information
            System.out.println("Channel: "
                               + fi.getChannel());

            // Display file descriptor
            System.out.println("File Descriptor: "
                               + fi.getFD());

            // Show available bytes in the stream
            System.out.println("Number of remaining bytes: "
                               + fi.available());

            // Skip first few bytes
            fi.skip(0);

            System.out.println("File Contents:");

            // Read and print file content
            int ch;
            while ((ch = fi.read()) != -1) {
                System.out.print((char)ch);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(
                "File not found: Ensure 'file1.txt' exists in the working directory.");
        }
        catch (IOException e) {
            System.out.println(
                "An error occurred while reading the file: "
                + e.getMessage());
        }
    }
}