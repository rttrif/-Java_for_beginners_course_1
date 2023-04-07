package Lesson_2;// Primitive data types
//Java - язык со строгой типизацией данных, т.е. каждая переменная должна иметь определенный тип данных

public class Lesson_2 {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 100;

        short s1 = 5;
        short s2 = 10;
        short s3 = 0;

        int i1 = 500;

        long l1 = 1000;
//      Для использования типа лонг с большими числами нужно в явном виде добовлять в конце числа L
        long l2 = 10000000000L;

        float f1 = 3.14F;
        float f2 = 2.5f;

        double d1 = 5.5;
        double d2 =87;

//      Символ всегда указывается в одинрных кавычках
        char c1 = 'a';
        char c2 = 'A';
        char c3 = ' ';
        char c4 = '7';

//      Выводит значение 300-ого синмвола в юникоде
        char c5 = 300; // Десятичная система исчесления
        char c6 = '\u0500'; // Шеснадцатиричная система исчесления

        boolean boool1 = true;
        boolean boool2 = false;

        int a1 = 1_00_0000______000;
        System.out.println(a1);

    }
}
