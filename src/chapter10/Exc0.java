package chapter10;

public class Exc0 {

    // try -  в данном блоке отслеживается код на предмет исключений.
    // catch - блок для перехвата сгенерированного в блоке try исключения и его рациональной обработки.
    // throw - ключевое слово для ручной генерации исключений.
    // throws - ключевое слово для обозначения исключений в объявлении метода.
    // finally - блок кода, который непременно выполняется по завершению блока try.

    // В версии JDK 7 внедрена новая форма оператора try с ресурсами.

    // Все типы исключений - это подклассы встроенного класса Throwable.
    // Throwable (подклассы ниже по иерархии):
    //   -- Exception (Исключительные ситуации, которые должна обработать прикладная программа)
    //                (Именно от этого класса наследуемся при создании собственных типов исключений)
    //      -- RuntimeException (Данный подкласс охватывает такие ошибки как / by zero or IndexOutOfBounds и другие)
    //   -- Error (Исключение в выполняющей среде Java, которые не могут быть обработаны прикладной программой)

    public static void main(String[] args) {
        int d = 0;
        int a = 42 / d; // исполняющая система java создает новый объект исключения и генерирует исключение
        // как только исключение сгенерировано - оно должно быть перехвачено.
        // обработчик отсутствует в данном методе - будет обработано стандартным обработчиком Java
        // стандартный обработчик выводит описание, результат трассировки стека и прерывает выполнение программы
    }
}