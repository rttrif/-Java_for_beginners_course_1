package Lesson_3;

public class Lesson_3_2 {
    public static void main(String[] args){
        int a = 3;
        int b = 5;
        int c = 5;

        boolean b1 = a > b;
        boolean b2 = a >= b;
        boolean b3 = b <= c;
        boolean b4 = b == b;
        boolean b5 = b != b;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        boolean x = true;
        boolean y = false;
        boolean z = true;

        boolean result1 = x && y && z;
        boolean result2 = x || y || z;
        System.out.println(result1);
        System.out.println(result2);

    }
}
