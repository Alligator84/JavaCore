package chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if (args.length != 2) {
            System.out.println("Error arguments command line");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException ex) {
            System.err.println("Error io: " + ex);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException ex) {
                System.err.println("Error close file input");
            }

            try {
                if (fout != null) fout.close();
            } catch (IOException ex) {
                System.err.println("Error close file output");
            }
        }
    }
}
