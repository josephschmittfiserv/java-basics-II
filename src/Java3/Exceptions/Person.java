package Java3.Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    int id;
    String firstName, lastName;

    public Person(int id, String firstName, String lastName) throws ValidationException {
        this.id = id;
        try {
            // do some work
            if (this.firstName.isBlank()) throw new ValidationException("Name is required for this input file");
        } catch (Exception e) {
            throw new ValidationException("Name is required for this input file");
        }
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

    public static void update(Integer num1, int num2, Person p, ArrayList<Person> people) throws ValidationException {
        num1 = 0;
        num2 = 0;
        try {
            // do some work
            people.add(new Person(2, 33, "Smith"));
        } catch (Exception e) {
            throw new ValidationException("Name is required for this input file");
        }
        
        p.setLastName("JONES");
    }

    public class ValidationException extends Exception {
        public ValidationException(String message) {
            super(message);
        }
    }

    public void doWork() throws ValidationException {

        throw new ValidationException("Bad user input");
    }
}
