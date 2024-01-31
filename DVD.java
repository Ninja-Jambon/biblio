// Roberto Leizour 24/01/2024

public class DVD extends Document {
    // Atributes

    String real;

    // Construcors

    public DVD(String title, String real) {
        super(title);

        this.real = real;
    }

    // Methods

    public void print() {
        System.out.println("Title : " + this.title + ", Real : " + this.real);
    }
}
