package chapter13;

// быстрее загружаются классы из-за меньшего кода
// если требуется создавать много объектов, то будет замедление из-за this

public class MyClassThis {

    int a;
    int b;

    MyClassThis(int i, int j) {
        a = i;
        b = j;
    }

    MyClassThis(int i) {
        this(i, 0); // всегда первым оператором
    }

    MyClassThis() {
        this(0, 0); // нельзя одновременно this и super
    }
}
