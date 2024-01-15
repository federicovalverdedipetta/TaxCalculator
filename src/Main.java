import java.util.Scanner;

public class IncomeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their annual income
        System.out.print("Enter your annual income: ");

        // Read the input from the user
        double annualIncome = scanner.nextDouble();

        // Close the scanner to free up resources
        scanner.close();

        // Print the entered income
        System.out.println("Your annual income is: $" + annualIncome);
    }
}


