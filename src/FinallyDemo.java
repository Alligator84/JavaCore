// Оператор finally выполняется по завершению блока кода try/catch
// но перед следующим за ним кодом

public class FinallyDemo {

    public static void main(String[] args) {
        try {
            getA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено.");
        }

        getB();
        getC();
    }

    static void getA() {
        try {
            System.out.println("В теле метода getA().");
            throw new IndexOutOfBoundsException("demo");
        } finally {
            System.out.println("Блок оператора finally в методе getA().");
        }
    }

    static void getB() {
        try {
            System.out.println("В теле метода getA().");
            return;
        } finally {
            System.out.println("Блок оператора finally в методе getB().");
        }
    }

    static void getC() {
        try {
            System.out.println("В теле метода getC().");
        } finally {
            System.out.println("Блок оператора finally в методе getC().");
        }
    }
}
