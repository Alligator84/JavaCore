package chapter13;

public class Test {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        System.out.println(mc.a);
        System.out.println(mc.b);

        MyClass mc2 = new MyClass(10);
        System.out.println(mc2.a);
        System.out.println(mc2.b);

        MyClass mc3 = new MyClass(100, 200);
        System.out.println(mc3.a);
        System.out.println(mc3.b);
    }
}
