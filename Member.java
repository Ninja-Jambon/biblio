// Roberto Leizour 24/01/2024

public class Member {
    // Attributes

    private String name;
    private String lastName;
    private int age;

    // Constructors

    public Member(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    // Methods

    public void print() {
        System.out.println("Name: " + this.name + " Last name: " + this.lastName + " Age: " + this.age);
    }
}
