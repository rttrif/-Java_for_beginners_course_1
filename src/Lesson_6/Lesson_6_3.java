package Lesson_6;

// Перезагрузка констрструкторов
// Перезагруженные конструкторы имеют разный список параметров
// Разный по типам данных
// Разный по количеству параметров
// Разный по порядку параметров
// Access modifier может быть одинаковый или различный
// Конструкторы отличающиеся только access modifier не являются overloaded
public class Lesson_6_3 {
    Lesson_6_3(int id2, String surname2, int age2){
        id = id2;
        surname = surname2;
        age = age2;
    }
    Lesson_6_3(String surname2, int age2){
        surname = surname2;
        age = age2;
    }
    Lesson_6_3(int id2, String surname2, int age2, double salary2, String department2){
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmploeeTest{
    public static void main(String[] args) {
        Lesson_6_3 emp1 = new Lesson_6_3(1, "Borisov", 34);
        System.out.println(emp1.surname);

        Lesson_6_3 emp2 = new Lesson_6_3( "Petrov", 234);
        System.out.println(emp2.age);

        Lesson_6_3 emp3 = new Lesson_6_3( 1, "Ivanov", 234, 2223,"Главный");
        System.out.println(emp3.department);
    }
}
