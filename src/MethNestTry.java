// Операторы try могут быть неявно вложены в вызовы методов
public class MethNestTry {

    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a: " + a);
            int b = 42 / a;
            nestTry(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль:" + e);
        }
    }

    static void nestTry(int a) {
        try {
            if (a == 1) a = a / (a - a);
            if (a == 2) {
                int[] c = { 1 };
                c[42] = 99;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива: " + e);
        }
    }
}
