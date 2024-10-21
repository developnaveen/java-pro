import java.util.Scanner;

// The public class must match the file name (RoomAreas.java)
public class RoomAreas {
    public static void main(String[] args) {
        double number; // To hold a number
        double totalArea; // The total area
        Scanner scanner = new Scanner(System.in);

        // Create three Rectangle objects.
        Rectangle kitchen = new Rectangle();
        Rectangle bedroom = new Rectangle();
        Rectangle den = new Rectangle();

        // Get and store the dimensions of the kitchen.
        System.out.print("What is the kitchen's length? ");
        number = scanner.nextDouble();
        kitchen.setLength(number);

        System.out.print("What is the kitchen's width? ");
        number = scanner.nextDouble();
        kitchen.setWidth(number);

        // Get and store the dimensions of the bedroom.
        System.out.print("What is the bedroom's length? ");
        number = scanner.nextDouble();
        bedroom.setLength(number);

        System.out.print("What is the bedroom's width? ");
        number = scanner.nextDouble();
        bedroom.setWidth(number);

        // Get and store the dimensions of the den.
        System.out.print("What is the den's length? ");
        number = scanner.nextDouble();
        den.setLength(number);

        System.out.print("What is the den's width? ");
        number = scanner.nextDouble();
        den.setWidth(number);

        // Calculate the total area of the rooms.
        totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();

        // Display the total area of the rooms.
        System.out.println("The total area of the rooms is " + totalArea);

        // Close the scanner.
        scanner.close();
    }
}

// The Rectangle class (non-public, so it's only accessible within this file)
class Rectangle {
    private double length;
    private double width;

    // Setter methods
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getter method to calculate area
    public double getArea() {
        return this.length * this.width;
    }
}
