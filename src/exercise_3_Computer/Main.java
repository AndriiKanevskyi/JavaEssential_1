package exercise_3_Computer;
/*
Використовуючи IDEA, створіть проект із пакетом.
Створити клас Computer, створити масив об'єктів Computers розміром 5.
Далі руками створити 5 екземплярів цього класу та записати на комп'ютер (використовуючи loop).
 */

public class Main {
    public static void main(String[] args) {
    Computer[] computers = new Computer[5];

        for (int i = 0; i < computers.length; i++) {
            Computer newComputer = new Computer();
            computers[i]=newComputer;
        }
    }
}
