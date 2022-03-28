package test.skypro.part1;

public class Author {
    private String name;
    private String surname;

    public Author (String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getAuthor () {
        return this.surname + " " + this.name;
    }
}
