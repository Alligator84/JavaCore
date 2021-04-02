package chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        // Попытка открыть файл.
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.err.println("Невозможно открыть файл.");
            return;
        }

        // Теперь файл открыть и готов к чтению.
        // Далее из него читаются символы до тех пор
        // Пока не встретится признак конца файла.
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.err.println("Ошибка чтения из файла");
        }

        // Пытаемся закрыть файл.
        try {
            fin.close();
        } catch (IOException e) {
            System.err.println("Ошибка закрытия файла");
        }

    }
}
