package Lesson_4;

// При такой организации class Lesson_4.Bank_Account_Lesson_4_1 используется, как шаблон.
// А class Lesson_4.Bank_Account_Test для создания экземпляров класса Lesson_4.Bank_Account_Lesson_4_1
public class Bank_Account_Lesson_4_1 {
//  Переменные объекта
    int id;
    String name;
    double balence;
}

class Bank_Account_Test{
    public static void main(String[] args){
        Bank_Account_Lesson_4 MyAccount = new Bank_Account_Lesson_4();
        Bank_Account_Lesson_4 YourAccount = new Bank_Account_Lesson_4();
        Bank_Account_Lesson_4 HisAccount = new Bank_Account_Lesson_4();

        MyAccount.id = 1;
        MyAccount.name = "Ruslan";
        MyAccount.balence = 34.87;

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balence = 88.87;

        HisAccount.id = 3;
        HisAccount.name = "Alex";
        HisAccount.balence = 222.87;

        System.out.println(MyAccount.id);
        System.out.println(MyAccount.name);
        System.out.println(MyAccount.balence);
    }
}