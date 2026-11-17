package IOCode;

import java.io.File;
import java.io.IOException;

public class ShowFiles {
    public static void main(String[] args) throws IOException {
        File f = new File("new.txt");
        f.createNewFile();
        f.canRead();
    }
}
