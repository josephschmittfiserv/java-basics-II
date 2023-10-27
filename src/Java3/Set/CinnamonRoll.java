package Java3.Set;

import java.util.HashSet;
import java.util.Objects;

public class CinnamonRoll {

    public static void main(String[] args) {
        HashSet<Person> personSet1 = new HashSet<>();
        HashSet<Person> personSet2 = new HashSet<>();

        personSet1.add(new Person(12, "John", "Snow"));
        personSet1.add(new Person(12, "John", "Snow")); // Duplicate item not added.
        personSet1.add(new Person(24, "Mary", "Williams"));
        personSet1.add(new Person(53, "Joey", "Junior"));

        personSet2.add(new Person(12, "John", "Snow"));
        personSet2.add(new Person(25, "Zoey", "Rhodes"));
        personSet2.add(new Person(66, "Brian", "Adams"));

        personSet1.addAll(personSet2); // Union: All the unique people from both sets.
        personSet1.retainAll(personSet2); // Intersection: The common people in both sets.

        System.out.println(personSet1);
    }
}

class Person {

    private int age, ssn;
    private String firstName, lastName;

    public Person(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstname() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public int getSSN() {
        return this.ssn;
    }

    @Override
    public String toString() {
        return "|" + this.age + ", " + this.firstName + ", " + this.lastName + "|";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Person person))
            return false;
        return Objects.equals(getFirstname(),
                person.getFirstname())
                && Objects.equals(getLastName(),
                        person.getLastName())
                && Objects.equals(getAge(),
                        person.getAge())
                && Objects.equals(ssn, person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastName(), getAge(), ssn);
    }
}
