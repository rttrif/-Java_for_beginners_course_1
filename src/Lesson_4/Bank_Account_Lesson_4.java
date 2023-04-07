package Lesson_4;// Любой класс в java то тип данных
// Референсный тип данных - это ссылочный тип данных
// Значение по умолчанию для референсных типов данны - null

public class Bank_Account_Lesson_4 {
    int id;
    String name;
    double balence;

//  Создаем объект (Экземпляр класса)
    public static void main(String[] args){
//      Тип данных переменной  Имя мерменной   Вызов конструктора = создание объекта
        Bank_Account_Lesson_4  bA            = new Bank_Account_Lesson_4();
//      new - означает создание нового объекта

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