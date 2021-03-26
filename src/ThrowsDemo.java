// Пробрасываем исключения вызывающему коду с помощью оператора throws в сигнатуре метода
// не обязательно включать непроверяемые исключения, только проверяемые

public class ThrowsDemo {

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }

    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne().");
        throw new IllegalAccessException("демонстрация");
    }

}
