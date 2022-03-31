package test.skypro;

import test.skypro.part1.Author;
import test.skypro.part1.Book;

public class Main {

    public static void main(String[] args) {
	    // авторы
        Author author1 = new Author("Пушкин", "Александр", "Сергеевич");
        Author author2 = new Author("Ирвинг", "Джон");

        // книги
        Book book1 = new Book("Молитва об Оуэне Мини", author2, 1989);
        Book book2 = new Book ("Правила виноделов", author2, 1985);
        Book book3 = new Book ("Руслан и Людмила", author1, 2000);

        System.out.println("book1 : " + book1);
        System.out.println("book2 : " + book2);
        System.out.println("book3 : " + book3);

        book3.setYearOfPublishing(2002);
        System.out.println("book3 (переиздание) : " + book3);
    }
}
