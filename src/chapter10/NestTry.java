package chapter10;

// Пример применения вложенных операторов try
public class NestTry {

    public static void main(String[] args) {
        try {
            int a = args.length;

            /* Если не указаны аргументы командной строки,
               в следующем операторе будет сгенерировано
               исключение в связи с делением на нуль. */
            int b = 42 / a;

            System.out.println("a = " + a);

            try {
                if (a == 1) a = a / (a - a);
                if (a == 2) {
                    int[] c = { 1 };
                    c[42] = 99;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Индекс за границами массива: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        }
    }
}
