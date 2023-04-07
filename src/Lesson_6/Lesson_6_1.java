package Lesson_6;

// Перезагрузка методов и конструкторов (overloading)
// Второй пример с перезагрузкой методов
public class Lesson_6_1 {
    void show(int i1) {
        System.out.println(i1);
    }
    void show(boolean b1) {
        System.out.println(b1);
    }
    void show(String s1) {
        System.out.println(s1);
    }
    void show(String s, int a) {
        System.out.println("String: " + s + " int: " + a);
    }
    void show( int a, String s) {
        System.out.println("Прикольная фича");
    }
}


class MethodOverloadingTest2 {
    public static void main(String[] args) {
        Lesson_6_1 mO = new Lesson_6_1();
        int a = 500;
        mO.show(100);
        mO.show(a);

        boolean b = true;
        mO.show(b);

        String s = "Ну привет!";
        mO.show(s);

        mO.show(s, a);
        mO.show(a, s);
    }
}
