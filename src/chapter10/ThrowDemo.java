package chapter10;

public class ThrowDemo {

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
            System.out.println(e.getMessage());
        }
    }

    static void demoProc() {
        try {
            throw new NullPointerException("демонстрация"); // создание экземпляра объекта стандартного исключения Java
            // аргумент - описание исключения
        } catch(NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoProc().");
            throw e;
        }
    }
}
