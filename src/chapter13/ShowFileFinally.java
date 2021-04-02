package chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFileFinally {

    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        if (args.length != 1) {
            System.err.println("Error arguments command line");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException ex) {
            System.err.println("Error open file");
            return;
        }

        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print( (char) i);
            } while (i != -1);
        } catch (IOException ex) {
            System.err.println("Error read file");
        } finally {
            try {
                fin.close();
            } catch (IOException ex) {
                System.err.println("Error close file");
            }
        }
    }
}
