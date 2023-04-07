package Lesson_5;

public class Lesson_5_1_Car {
    //    Lesson_5.Lesson_5_1_Car(){} //  Дефолтный конструктор
//  Не дефолтный конструктор
    Lesson_5_1_Car(String cvet, String motor){
        color = cvet;
        engine = motor;
    }
    String color;
    String engine;
    int speed;

    int gaz(int skorost){
        speed +=skorost;
        return speed;
    }

    int tormoz(int skorost){
        speed -=skorost;
        return speed;
    }
// Когда нет результата функции т.е. не указывается return, то для отображения информации используется void
    void showInfo(){
        System.out.println("Цвет: " + color + " Двигатель: " + engine + " Скорость: " + speed);
    }
}

class CarTest{
    public static void main(String[] args){
        Lesson_5_1_Car car_1 = new Lesson_5_1_Car("Желтый", "М7");
//        car_1.color = "Белая";
//        car_1.engine = "V6";
        car_1.speed = 100;

        car_1.showInfo();
        car_1.gaz(76);
        car_1.showInfo();
        car_1.tormoz(99);
        car_1.showInfo();

    }
}