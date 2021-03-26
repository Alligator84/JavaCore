package chapter10;

// Продемонстрировать применение нескольких операторов catch
public class MultipleCatch {

    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a: " + a);
            int b = 42 / a;
            int[] c = { 1 };
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации за пределами массива: " + e);
        }
        System.out.println("После блоков операторов try/catch.");
    }
}

// перехват исключений из подклассов должны следовать до перехвата исключений из суперклассов
// чтобы исключить недостижимый код
