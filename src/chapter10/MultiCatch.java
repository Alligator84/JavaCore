package chapter10;// В JDK 7 подсистема исключений была дополнена средствами:
//   -- try с ресурсами
//   -- многократный перехват
//   -- окончательное повторное генерирование исключений

public class MultiCatch {

    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = { 1, 2, 3 };

        try {
            int result = a / b;
            vals[5] = 99;
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Исключение перехвачено: " + e);
        }
        System.out.println("После многократного перехвата.");
    }
}
