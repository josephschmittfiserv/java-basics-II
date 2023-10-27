package Inheritance;

import java.util.Objects;

public class Cat {

    // Data...
    private String name;

    // Constructors...
    public Cat(String name) {
        this.name = name;
    }

    // Methods...
    public String getName() {
        return name;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (this == o)
    //         return true;
    //     if (o == null || getClass() != o.getClass())
    //         return false;
    //     Person person = (Person) o;
    //     return age == person.age && firstname.equals(person.firstname) && lastname.equals(person.lastname);
    // }

    // @Override
    // public int hashCode() { // Used for Hash* data structures (e.g. prevents dupes in HashSets).
    //     return Objects.hash(age, firstname, lastname);
    // }

    public static void main(String[] args) {
        var myCat = new Cat("Gypsy");
        System.out.println(myCat.toString());
    }
}