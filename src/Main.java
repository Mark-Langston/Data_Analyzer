// CSC262 Programming in Java
// Mark Langston 5/17/2024
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numerical Data Analyzer"); // Title for program
        System.out.println(" "); // Blank line
        System.out.println("Enter floating-point values. Enter a non-number to finish:"); // Data entry prompt

        double sum = 0; // Stores total of all entered data
        int count = 0; // Stores how many values entered
        double min = Double.MAX_VALUE; // Stores highest entered value
        double max = Double.MIN_VALUE; // Stores lowest entered value

        while (scanner.hasNext()) { // Loop that runs while valid numbers entered
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                sum += value;
                count++;

                if (value < min) {
                    min = value;
                }

                if (value > max) {
                    max = value;
                }
            } else {
                break;
            }
        }

        if (count > 0) { // as long as one or more numbers are entered
            double average = sum / count;
            double range = max - min;

            System.out.printf("Average of the entered values: %.2f%n", average);
            System.out.printf("Smallest number from the entered values: %.2f%n", min);
            System.out.printf("Largest number from the entered values: %.2f%n", max);
            System.out.printf("Range/Difference of entered values: %.2f%n", range);
        } else {
            System.out.println("No numerical data entered for analysis."); // in case no data is entered
        }

        scanner.close();
    }
}