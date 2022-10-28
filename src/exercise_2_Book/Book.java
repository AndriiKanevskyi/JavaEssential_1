package exercise_2_Book;

/*
Завдання 3


Використовуючи IDEA, створіть проект із пакетом.
Потрібно: Створити клас Book (Main).
Створити класи Title, Author та Content,
кожен з яких повинен містити одне рядкове поле та метод void show().
Реалізуйте можливість додавання до книги назви книги, імені автора та змісту.
Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.
 */
public class Book {
    Title bookTitle = new Title();
    Author bookAuthor = new Author();
    Content bookContent = new Content();


    //Бонусний метод классу Book який буде виводити всі данні о книзі одразу :

    public static void showAll(Book book){

        System.out.println("\nПраця додаткового методу классу Book\n");
        String result = "Автор книги :"+book.bookAuthor.author +"\n"+"Назва книги :"+book.bookTitle.title+"\n"+"Зміст книги :"+book.bookContent.content;
        System.out.println(result);
    }

}
