// Roberto Leizour 24/01/2024

public class AppBibli {

    public static void main(String[] args) {
        Member[] people = new Member[100];
        Bibli bibli = new Bibli("La chaise jaune", "2 rue du caca, Lorient");
        people[0] = new Member("chaise", "caca", 12);
        bibli.addMember(people[0]);

        bibli.addBook("la chaise verte", 2020, "jean claude");
        bibli.addDVD("COUCOU", "Jean pierre");
        bibli.AddCommic("Jean claude et ses cramptés", "Nicolas", "Antoine");

        bibli.printBibli();

        
    }
}