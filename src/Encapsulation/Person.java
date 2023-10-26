package Inheritance.Encapsulation;

public final class Person {
    private int ssn;
    private byte age;
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName, Byte age, Integer ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public byte getAge() {
        return age;
    }
}