package Lesson_6;

// Методы, отличающиеся только return type или access modifier не являются overloaded
// !!! Перезагруженные методы имеют одинаковые имена и разный список параметров
public class Lesson_6_2 {
    int sum(int i1, int i2){
        return i1 + i2;
    }
    String sum(String s1, String s2){
        return s1 + s2;
    }
}

class MethodOverloadingTest3 {
    public static void main(String[] args) {
        Lesson_6_2 mO2 = new Lesson_6_2();
        int a = 500;
        int b = 99;

        String s1 = "Ну привет!";
        String s2 = "Ну пока!";

        System.out.println(mO2.sum(a, b));
        System.out.println(mO2.sum(s1, s2));

    }
}