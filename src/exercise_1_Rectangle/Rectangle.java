package exercise_1_Rectangle;

public class Rectangle {
    /*
    Використовуючи IDEA, створіть проект із пакетом. Потрібно: Створити клас із ім'ям Rectangle.
     У тілі класу створити два поля, що описують довжини сторін double side1, double side2.
     Створити два методи, що обчислюють площу прямокутника - double areaCalculator (double side1, double side2)
     і периметр прямокутника - double perimeterCalculator (double side1, double side2).
     Написати програму, яка приймає від користувача довжини двох сторін прямокутника
     і виводить на екран периметр та площу.

     */

    double side1;
    double side2;


    public Rectangle(double side1,double side2){ //конструктор с приемом данных о длине сторон
        this.side1=side1;
        this.side2=side2;
    }

    double areaCalculator(){
        double area = this.side1*this.side2;
        return area;
    }
    double perimeterCalculator (){
        double perimeter = (this.side1+this.side2)*2;
        return perimeter;
    }


}
