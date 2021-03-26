package chapter10;

import javax.print.attribute.standard.NumberUp;

// В версии JDK 1.4 в подсистему исключений были внедрены цепочки исключений
public class ChainExcDemo {

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            // Выводим исключение верхнего уровня
            System.out.println("Перехвачено исключение: " + e);

            // Выводим исключение нижнего уровня
            System.out.println("Первопричина: " + e.getCause());
        }
    }

    // Почему в данном случае в сигнатуре метода не нужно пробрасывать исключение?
    static void demoProc() {
        NullPointerException e = new NullPointerException("верхний уровень");
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }
}
