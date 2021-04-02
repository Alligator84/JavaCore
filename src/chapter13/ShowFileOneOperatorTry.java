package chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFileOneOperatorTry {

    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        if (args.length != 1) {
            System.err.println("Error argument commands line");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) System.out.print( (char) i);
            } while (i != -1);
        } catch (FileNotFoundException ex) {
            System.err.println("Error open file");
        } catch (IOException ex) {
            System.err.println("Error read file");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException ex) {
                System.err.println("Error close file");
            }
        }
    }
}
