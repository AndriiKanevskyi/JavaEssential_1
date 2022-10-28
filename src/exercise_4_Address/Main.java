package exercise_4_Address;
/*
Використовуючи IDEA, створіть проект із пакетом.
Потрібно: Створити клас із ім'ям Address.
У тілі класу потрібно створити поля: index, country, city, street, house, apartment.
Для кожного поля створити метод з двома методами доступу (get, set)
Створити екземпляр класу Address. У поля екземпляра записати інформацію про поштову адресу.
 Виведіть на екран значення полів, що описують адресу.
 */
public class Main {
    public static void main(String[] args) {

        Address myAdess = new Address();

        myAdess.setCountry("USA");
        myAdess.setCity("Washington");
        myAdess.setStreet("Pennsylvania Avenue");
        myAdess.setHouse(1600);
        myAdess.setApartment(1);
        myAdess.setIndex(20500);

        System.out.println(myAdess.getStreet());
        System.out.println(myAdess.getHouse());
        System.out.println(myAdess.getApartment());
        System.out.println(myAdess.getCountry());
        System.out.println(myAdess.getCity());
        System.out.println(myAdess.getIndex());
    }
}