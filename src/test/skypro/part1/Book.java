package test.skypro.part1;

import java.time.LocalDate;

public class Book {
    private String name;
    private Author author;
    private int yearOfPublishing;

    public Book (String name, String surnameAuthor, String nameAuthor, int year) {
        this.name= name;
        this.author = new Author(surnameAuthor, nameAuthor);
        this.yearOfPublishing = year;
    }

    public String getName () {
        return this.name;
    }

    public String getAuthor () {
        return this.getAuthor();
    }

    public int getYearOfPublishing () {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing (int year2) {
        int currentYear = LocalDate.now().getYear();
        if (year2 <= currentYear) this.yearOfPublishing = year2;
    }
}
