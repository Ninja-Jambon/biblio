// Roberto Leizour 24/01/2024

public class Book extends Document {
    // Atributes 

    int release;
    String author;

    // Constructors

    public Book(String title, int release, String author) {
        super(title);

        this.release = release;
        this.author = author;
    }

    // Methods

    public void print() {
        System.out.println("Title : " + this.title + ", Release : " + this.release + ", Author : " + this.author);
    }
}
