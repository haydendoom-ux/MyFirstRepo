import java.util.Scanner;

public class WhileLoopCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        double number;
        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        // Loop to get 5 values
        while (count < 5) {
            System.out.print("Enter number " + (count + 1) + ": ");
            
            // Prevents endless loop if user enters invalid input
            if (input.hasNextDouble()) {
                number = input.nextDouble();

                total += number;

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

                count++; // moves loop forward
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // clears bad input
            }
        }

        double average = total / 5;
        double interest = total * 0.20;

        System.out.println("\nResults:");
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest (20%): " + interest);

        input.close();
    }
}