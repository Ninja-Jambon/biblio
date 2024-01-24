// Roberto Leizour 24/01/2024

public class Bibli {
    // Attributes

    private String name;
    private String street;
    private Boolean opened;
    private Book [] books;
    private Member [] members;

    // Constructors

    public Bibli(String name, String street) {
        this.name = name;
        this.street = street;
        this.opened = false;
        this.books = new Book[100];
        this.members = new Member[100];        
    }

    public void addMember(Member member) {
        for (int i = 0; i < 100; i++) {
            if (this.members[i] == null) {
                this.members[i] = member;
                return;
            }
        }
    }

    public void printMembers() {
        for (int i = 0; i < 100; i ++) {
            if (this.members[i] != null) {
                this.members[i].print();
            }
        }
    }

    public void addBook(String title, String author) {
        for (int i = 0; i < 100; i ++) {
            if (this.books[i] == null) {
                this.books[i] = new Book(title, author);
                return;
            }
        }
    }

    public void printBooks() {
        for (int i = 0; i < 100; i++) {
            if (this.books[i] != null) {
                this.books[i].print();
            }
        }
    }

    // Methods
}
