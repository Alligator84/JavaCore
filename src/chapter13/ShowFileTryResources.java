package chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFileTryResources {

    public static void main(String[] args) {
        int i;

        if (args.length != 1) {
            System.out.println("Error arguments command line");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException ex) {
            System.err.println("File not found: " + ex);
        } catch (IOException ex) {
            System.err.println("Error read file");
        }
    }
}
