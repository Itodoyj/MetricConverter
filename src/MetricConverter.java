import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters;

        // Input for the measurement in meters
        do {
            System.out.print("Enter the measurement in meters: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            meters = scanner.nextDouble();
        } while (meters <= 0);

        // Convert meters to miles, feet, and inches
        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;

        // Output the results
        System.out.println("Measurement in miles: " + miles);
        System.out.println("Measurement in feet: " + feet);
        System.out.println("Measurement in inches: " + inches);

        scanner.close();
    }
}
