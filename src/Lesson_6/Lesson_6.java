package Lesson_6;

// Перезагрузка методов и конструкторов (overloading)
// Начальный пример.
public class Lesson_6 {
    void showInt(int i1){
        System.out.println(i1);
    }
    void showBoolean(boolean b1){
        System.out.println(b1);
    }
    void showString(String s1){
        System.out.println(s1);
    }
}

class MethodOverloadingTest{
    public static void main(String[] args) {
        Lesson_6 mO = new Lesson_6();
        int a = 500;
        mO.showInt(100);
        mO.showInt(a);

        boolean b = true;
        mO.showBoolean(b);

        String s = "Ну привет!";
        mO.showString(s);
    }
}
