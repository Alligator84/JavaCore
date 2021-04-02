// Стандартный поток вывода System.out обычно применяют для отладки программ и в учебных целях.
// В рабочих приложениях рекомендуется применять класс PrintWriter
// Применение данного класса для консольного вывода упрощает интернационализацию прикладных программ.
// PrintWriter(OutputStream поток_вывода, boolean очистка)

package chapter13;

import java.io.PrintWriter;

public class PrintWriterDemo {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Hello, i am programming on the Java");

        int i = -7;
        pw.println(i);

        double d = 4.5e-7;
        pw.println(d);
    }
}
