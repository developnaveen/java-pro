package javaInterface;

import java.util.Scanner;

// Define the Shape interface
interface Shape {
    void getArea();
    void getPerimeter();
}

// Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    private int length, width;

    // Constructor to initialize length and width
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Implementing getArea method
    public void getArea() {
        System.out.println("Rectangle Area: " + (length * width));
    }

    // Implementing getPerimeter method
    public void getPerimeter() {
        System.out.println("Rectangle Perimeter: " + 2 * (length + width));
    }
}

// Circle class implementing the Shape interface
class Circle implements Shape {
    private double radius;

    // Constructor to initialize radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing getArea method
    public void getArea() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }

    // Implementing getPerimeter method
    public void getPerimeter() {
        System.out.println("Circle Perimeter: " + (2 * Math.PI * radius));
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Rectangle
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        // Creating a Rectangle object and calling methods
        Shape rectangle = new Rectangle(length, width);
        rectangle.getArea();
        rectangle.getPerimeter();

        // Input for Circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Creating a Circle object and calling methods
        Shape circle = new Circle(radius);
        circle.getArea();
        circle.getPerimeter();

        scanner.close();
    }
}
