package IOCode;
import java.io.*;
//import java.io.BufferedReader;
public class Day1Code {
     public static void main(String[] args) throws IOException{
        byte [] b = new byte[100];
        System.out.println("Enter some characters: ");
        int numread = System.in.read(b);    //using int read(byte [] b) method of InputStream
        System.out.println("You entered: ");
        for (int i = 0; i < numread; i++) {
            System.out.write(b[i]);
        }
     }
}
