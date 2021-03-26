package chapter10;// Стандартный обработчик исключений удобен для отладки
// Ручная обработка исключений дает два преимущества:
//    -- предотвращает автоматическое прерывание программы
//    -- появляется возможность исправить ошибку

public class Exc2 {

    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено.");
        } catch (ArithmeticException e) { // перехватить ошибку деления на ноль
            System.out.println("Деление на нуль.");
        }
        System.out.println("После оператора catch.");
    }
}
