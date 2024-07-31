import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Get second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Ask the user whether to add or subtract
        System.out.print("Enter operation (add/subtract): ");
        String operation = scanner.next();

        // Perform the operation
        double result = 0;
        if ("add".equalsIgnoreCase(operation)) {
            result = num1 + num2;
        } else if ("subtract".equalsIgnoreCase(operation)) {
            result = num1 - num2;
        } else {
            System.out.println("Invalid operation. Please enter 'add' or 'subtract'.");
            scanner.close();
            return;
        }

        // Print the result
        System.out.println("The result is: " + result);

        // Close the scanner
        scanner.close();
    }
}
