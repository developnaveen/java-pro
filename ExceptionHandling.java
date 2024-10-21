import java.util.Scanner;
import java.io.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // ArithmeticException: Division by zero
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("Result: " + (10 / number));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: Division by zero.");
        }

        try {
            // NullPointerException: If the string is null
            System.out.print("Enter a string: ");
            String text = scanner.next();
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer error: Object is null.");
        }

        try {
            // ArrayIndexOutOfBoundsException: Invalid array index access
            System.out.print("Enter an index: ");
            int index = scanner.nextInt();
            int[] numbers = { 1, 2, 3 };
            System.out.println("Value: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }

        try {
            // NumberFormatException: Invalid number format
            System.out.print("Enter a number: ");
            int inputNumber = Integer.parseInt(scanner.next());
            System.out.println("Number: " + inputNumber);
        } catch (NumberFormatException e) {
            System.out.println("Number format error: Invalid input.");
        }

        try {
            // FileNotFoundException: Reading a file that does not exist
            System.out.print("Enter a filename: ");
            String filename = scanner.next();
            File file = new File(filename);
            try (Scanner fileScanner = new Scanner(file)) {
                System.out.println("File content: " + fileScanner.nextLine());
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Closing the scanner to avoid resource leaks
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}
