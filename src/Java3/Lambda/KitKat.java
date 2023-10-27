package Java3.Lambda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class KitKat extends Person {

    public static void main(String[] args) {
        HashSet<Person> stronglyTypedList = new HashSet<>();

        stronglyTypedList.add(new Person(12, "John", "Snow"));
        stronglyTypedList.add(new Person(12, "John", "Snow")); // Duplicate item not added.
        stronglyTypedList.add(new Person(24, "Mary", "Williams"));
        stronglyTypedList.add(new Person(53, "Joey", "Junior"));

        stronglyTypedList.add(new Person(12, "John", "Snow"));
        stronglyTypedList.add(new Person(25, "Zoey", "Rhodes"));
        stronglyTypedList.add(new Person(66, "Brian", "Adams"));

        var filteredList = stronglyTypedList.stream()
                .filter(p -> p.getAge() > 24)
                .collect(Collectors.toList());
        System.out.println(filteredList);

        var mapFilterList = stronglyTypedList.stream()
                .map(p -> p.getAge())
                .filter(x -> x > 30)
                .collect(Collectors.toList());
        System.out.println(mapFilterList);
    }
}

class Person {

    private int age;
    private String firstName, lastName;

    public Person() {

    }

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

    @Override
    public String toString() {
        return "|" + this.age + ", " + this.firstName + ", " + this.lastName + "|";
    }
}
