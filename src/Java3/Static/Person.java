package Java3.Static;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private static int personCount;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personCount++;
    }

    public static int getPersonCount() {
        return personCount;
    }

    public static void main(String[] args) {
        var p1 = new Person(1, "Alice", "Smith");
        var p2 = new Person(1, "Bob", "Jones");
        var p3 = new Person(1, "Charlie", "Beans");
        System.out.println(Person.getPersonCount());
    }
}