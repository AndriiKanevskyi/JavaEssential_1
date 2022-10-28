package exercise_2_Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть автора книги :");
        book1.bookAuthor.author= scanner.nextLine();

        System.out.println("Введіть назву книги :");
        book1.bookTitle.title=scanner.nextLine();

        System.out.println("Введіть зміст книги :");
        book1.bookContent.content=scanner.nextLine();

        // стандартне виконання згідно завданню
        book1.bookAuthor.show();
        book1.bookTitle.show();
        book1.bookContent.show();

        //Бонусний функціонал- додатковий метод в классі Book який збирає все до купи
        Book.showAll(book1);
    }

}
