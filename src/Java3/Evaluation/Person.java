package Java3.Evaluation;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    int id;
    String firstName, lastName;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Person{id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + "}";
    }

    public static void main(String[] args) throws Exception {
        int num2 = 22;
        Integer num1 = 11;
        var p = new Person(1, "Alice", "Jones");
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(p));
        update(num1, num2, p, people);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(p);
        System.out.println(people);
    }

    public static void update(Integer num1, int num2, Person p, ArrayList<Person> people) {
        num1 = 0;
        num2 = 0;
        people.add(new Person(2, "John", "Smith"));
        p.setLastName("JONES");
    }
}