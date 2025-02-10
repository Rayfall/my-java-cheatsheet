package IntermediateExamples;
import java.util.Scanner;

public class CompoundCalculator {
    public void CompoundInterestCalculator() {
        Scanner scanner = new Scanner(System.in);

        double principal = 0.0;
        double rate = 0.0;
        double amount = 0.0;
        int timesCompounded = 0;
        int years = 0;
        
        System.out.println("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.println("Enter in the interest rate (in percentage): ");
        rate = scanner.nextDouble() / 100;

        System.out.println("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.println("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + (rate / timesCompounded), timesCompounded * years);

        //System.out.println("The amount after " + years + " is $" + amount); // Original way.
        System.out.printf("The amount after %d years is $%.2f", years, amount);
        System.out.println("\n");

        scanner.close();
    }
}
