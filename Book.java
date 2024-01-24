// Roberto Leizour 24/01/2024

public class Book {
    // Attributes

    private String title;
    private String author;
    public Member borrower;

    // Constructors

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Methods

    public void print() {
        System.out.println("Title: " + this.title + " Author: " + this.author);
    }
}
