package exercise_1_Rectangle;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть, будь ласка довживу сторони 1");
        double side1 =scanner.nextDouble();
        while (side1<=0){//Перевірки чи користувач не ввів 0
            System.out.println("Не існує прямокутників з довжиною сторони 0 або меньше. Будь ласка, повторіть ввід довжини");
            side1 = scanner.nextDouble();
        }


        System.out.println("Введіть, будь ласка довживу сторони 2");
        double side2 = scanner.nextDouble();
        while (side2<=0){//Перевірки чи користувач не ввів 0
            System.out.println("Не існує прямокутників з довжиною сторони 0 або меньше. Будь ласка, повторіть ввід довжини");
            side2 = scanner.nextDouble();
        }

        Rectangle rectangle = new Rectangle(side1,side2);
        System.out.println("_________________________________________________________");
        System.out.println("Площа отриманого прямокутника "+rectangle.areaCalculator());
        System.out.println("Перимитер отриманого прямокутника "+rectangle.perimeterCalculator());



    }
}