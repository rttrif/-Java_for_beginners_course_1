package Lesson_5;// Метод отображает поведение (действие) класса - в других языках тоже самое, что и функция
// Атрибуты в основном задаются существительными
// Методы задаются глаголами

/*
Структура метода
public static void main(String[] args){code}

public - access modifier
static - non-access modifier
void - return type
main - name of method
() - parameters
{} - body of method
* */
public class Lesson_5 {
    int summa(int a, int b, int c) {
    int result = a + b + c;
    return result;
    }
//  Вызов метода внутри другого метода
    int sredneeArif(int a1, int b1, int c1){
        int srednee = summa(a1,b1, c1) / 3;
        return srednee;
    }


}
//  Вызов метода (method call)

class test_my_first_java_function{
    public static void main(String [] args){
//  Т.к. функция summa пренадлежит классу Lesson_5.Lesson_5, то сначала нужно создать экземпляр (объект) класса Lesson_5.Lesson_5
        Lesson_5 my_first_java_function = new Lesson_5();
        int result_summa =  my_first_java_function.summa(3, 5, 5);

        System.out.println("Результат работы моей первой функции: " + result_summa);
        System.out.println("Результат вызова метода внутри метода: " + my_first_java_function.sredneeArif(20, 50, 60));
    }
}
// RULE: LiFo - Last in First out
// Основная цель конструктора (new) - это создание объекта. Название конструктора ВСЕГДА совпадает с именем класса