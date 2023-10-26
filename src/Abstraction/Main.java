package Inheritance.Abstraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var shapes = new ArrayList<Shape>();

        var circle = new Circle();
        var square = new Square();
        var triangle = new Triangle();

        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);

        for (Shape s : shapes) {
            System.out.println(s.draw()); // <= Polymorphism (late binding) is happening here.
        }
    }
}