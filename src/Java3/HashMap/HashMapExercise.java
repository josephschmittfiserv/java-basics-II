package Java3.HashMap;
import java.util.HashMap;

public class HashMapExercise {

    public static void main(String[] args) {

        // Initialize Person objects
        var p = new Person(11, "joe", "plumber");
        var j = new Person(11, "jimby", "firefighter");

        // Initialize HashMap with String key and Person Value
        var personMap = new HashMap<String, Person>();

        // Add to the map with phone# key and Person values
        personMap.put("111-11-1111", p);
        personMap.put("111-11-1112", j);

        // Get the Person values from the map by using the phone# key
        var pp = personMap.get("111-11-1111");
        var pj = personMap.get("111-11-1112");

        // Print the map variables via the overidden toString() method in the Person class
        System.out.println("\t" + pp);
        System.out.println("\n\t" + pj);

        // Remove a value from the map by using the .remove(key) HashMap helper function
        personMap.remove("111-11-1111");
        System.out.println("\n\tAfter removing joe: " + personMap);

        // Replace a value from the map by using the .replace(key) HashMap helper function
        personMap.replace("111-11-1112", pp);
        System.out.println("\n\tAfter replacing jimby with joe: " + personMap);

        // After using containsKey() helper function
        if (personMap.containsKey("111-11-1111")){
            System.out.println("Key that isnt in map being printed");
        } else if (personMap.containsKey("111-11-1112")){
            System.out.println("\n\tKey that is in map being printed}");
        }
    }
}

class Person {

    private int age;
    private String name, job;

    public Person(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return this.age + ", " + this.name + ", " + this.job;
    }
}
