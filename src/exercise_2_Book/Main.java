package exercise_2_Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.bookAuthor.author="Тарас Шевченко";
        book1.bookTitle.title="Заповіт";
        book1.bookContent.content="Як умру то поховайте, мене на могилі...";

        book1.bookAuthor.show();
        book1.bookTitle.show();
        book1.bookContent.show();

        //Бонусний функціонал

        Book.showAll(book1);
    }

}
