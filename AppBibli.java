// Roberto Leizour 24/01/2024

public class AppBibli {

    public static void main(String[] args) {
        Member [] people = new Member[1000];
        Bibli bibli = new Bibli("La chaise jaune", "2 rue du caca, Lorient");
        for (int i = 0; i < 100; i++) {
            people[i] = new Member("chaise", "caca", 12);
            bibli.addMember(people[i]);
        }

        bibli.printMembers();

        for (int i = 0; i < 100; i ++) {
            bibli.addBook("la chaise verte", "jean claude");
        }

        bibli.printBooks();
    }
}