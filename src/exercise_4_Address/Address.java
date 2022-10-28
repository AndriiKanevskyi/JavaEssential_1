package exercise_4_Address;
/*
Використовуючи IDEA, створіть проект із пакетом.
Потрібно: Створити клас із ім'ям Address.
У тілі класу потрібно створити поля: index, country, city, street, house, apartment.
Для кожного поля створити метод з двома методами доступу (get, set)
Створити екземпляр класу Address. У поля екземпляра записати інформацію про поштову адресу.
 Виведіть на екран значення полів, що описують адресу.
 */
public class Address {

private int index;
private String country;
private String city;
private String street;
private int house;
private int apartment;


    public void setIndex(int index) {
        this.index = index;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public int getIndex() {
        return index;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public int getApartment() {
        return apartment;
    }
}
