package exercise_3_Computer;
/*
Використовуючи IDEA, створіть проект із пакетом.
Створити клас Computer, створити масив об'єктів Computers розміром 5.
Далі руками створити 5 екземплярів цього класу та записати на комп'ютер (використовуючи loop).
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         Computer[] comp = new Computer [5];
        for (int i = 0; i < 5; i++){
            comp[i] = new Computer("computer" + (i + 1));
        }
        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i].computerName);
        }
    }
}
