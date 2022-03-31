package test.skypro.part1;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private int id;
    private String name;
    private Author author;
    private int yearOfPublishing;

    public Book (String name, Author author, int year) {
        this.id = 1;
        this.name= name;
        this.author = author;
        this.yearOfPublishing = year;
    }

    public int getId () {
        return this.id;
    }

    public String getName () {
        return this.name;
    }

    public String getAuthor () {
        return this.author.getAuthor();
    }

    public int getYearOfPublishing () {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing (int year2) {
        int currentYear = LocalDate.now().getYear();
        if (year2 <= currentYear) this.yearOfPublishing = year2;
    }

    @Override
    public String toString () {
        return this.getName() + "; " + this.getAuthor() + "; " + this.getYearOfPublishing() + " г. ";
    }

    @Override
    public boolean equals (Book book2) {
        if (this.getClass() != book2.getClass()) return false;
        Book temp = (Book) book2;
        return id == temp.id;
    }

    @Override
    public int hashCode () {
        return Objects.hash(id);
    }
}
