package Lesson_3;

public class Lesson_3_1 {
    public static void main(String[] args){

        int a = 5;
        int b = a * 2;

        int x = 1, y = 2, z = 3;

        int c = b + a - (y + z)^56;

        System.out.println(b+a);
        System.out.println(b + a - (y + z));
        System.out.println(c);

        int a1 = 11;
        int b1 = 3;
//      Деление int на int = int - дробная часть отсекается
        System.out.println(a1 / b1);

        double a2 = 11;
        double b2 = 3;
//      Деление int на int = int - дробная часть отсекается
        System.out.println(a2 / b2);

        int a3 = 11;
        int b3 = 3;
        int celay_chast = a3 / b3;
        int ostatok = a3 % b3;
        System.out.println(celay_chast);
        System.out.println(ostatok);

        int x1 = 5, y1 = 3;
        int z1 = x1 - y1++;
        System.out.println(z1);
        System.out.println(y1);

        x1 += 3;
        y1 -= 2;
        System.out.println(x1);
        System.out.println(y1);
    }
}

