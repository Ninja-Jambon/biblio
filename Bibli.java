// Roberto Leizour 24/01/2024

public class Bibli {
    // Attributes

    private String name;
    private String street;
    private Boolean open;
    private Document [] documents;
    private Member [] members;

    // Constructors

    public Bibli(String name, String street) {
        this.name = name;
        this.street = street;
        this.open = false;
        this.documents = new Document[100];
        this.members = new Member[20];        
    }

    // Methods

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

    public void addBook(String title, int release, String author) {
        for (int i = 0; i < 100; i ++) {
            if (this.documents[i] == null) {
                this.documents[i] = new Book(title, release, author);
                return;
            }
        }
    }

    public void addDVD(String title, String real) {
        for (int i = 0; i < 100; i ++) {
            if (this.documents[i] == null) {
                this.documents[i] = new DVD(title, real);
                return;
            }
        }
    }

    public void AddCommic(String title, String drawer, String writer) {
        for (int i = 0; i < 100; i ++) {
            if (this.documents[i] == null) {
                this.documents[i] = new Commic(title, drawer, writer);
                return;
            }
        }
    }

    public void printDocuments() {
        for (int i = 0; i < 100; i++) {
            if (this.documents[i] != null) {
                this.documents[i].print();
            }
        }
    }

    public void borrow(Document document, Member member) {
        document.borrow(member);
    }

    public void printBibli() {
        System.out.println(this.name + ", " + this.street + ", Open : " + this.open);
        System.out.println("\nMembers :\n");
        this.printMembers();
        System.out.println("\nDocuments :\n");
        this.printDocuments();
    }
}
