package Inheritance.Compositoin;

public class Leg {

    private Integer length;

    public Leg(Integer length) {
        this.length = length;
    }

    public static void main(String[] args) {
        var myTable = new Table(4);
    }
}
