// Roberto Leizour 24/01/2024

public class Commic extends Document {
    // Atributes

    String drawer;
    String writer;

    // Constructors

    public Commic(String title, String drawer, String writer) {
        super(title);

        this.drawer = drawer;
        this.writer = writer;
    }

    public void print() {
        System.out.println("Title : " + this.title + ", Drawer : " + this.drawer + ", Writer : " + this.writer);
    }

    // Methods
}
