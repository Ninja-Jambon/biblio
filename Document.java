// Roberto Leizour 24/01/2024

abstract public class Document {
    // Attributes

    protected String title;
    protected Member borrower;

    // Constructors

    public Document(String title) {
        this.title = title;
    }

    // Methods

    abstract void print();

    public void borrow(Member member) {
        this.borrower = member;
    }
}
