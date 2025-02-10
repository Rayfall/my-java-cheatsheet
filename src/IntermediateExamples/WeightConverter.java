package IntermediateExamples;
import java.util.Scanner;

public class WeightConverter {
    public void weightConversion() {
        Scanner scanner = new Scanner(System.in);
        // DECLARE VARIABLES
        double weight = 0.0;
        double newWeight = 0.0;
        int choice = 0;

        // WELCOME MESSAGE
        System.out.println("Weight Conversion Program 1.0");
        System.out.println("Option 1: Convert lbs to kgs");
        System.out.println("Option 2: Convert kgs to lbs");

        while (!(choice == 1 || choice == 2)) {
            // PROMPT FOR USER INPUT OR CHOICE
            System.out.print("\nWhich option would you like? ");
            choice = scanner.nextInt();

            // OPTION 1: CONVERT LBS TO KGS
            if(choice == 1) {
                System.out.print("\nWhat is the weight (lbs): ");
                weight = scanner.nextDouble();
                newWeight = weight * 0.453592;
                System.out.printf("The weight in kilograms (kgs) is %.2f", newWeight);
            } 
            // OPTION 2: CONVERT KGS TO LBS
            else if (choice == 2) {
                System.out.print("\nWhat is the weight (kgs): ");
                weight = scanner.nextDouble();
                newWeight = weight * 2.20462;
                System.out.printf("The weight in pounds (lbs) is %.2f", newWeight);
            }
            // Write an Else statement to prompt the user of a bad choice.
            else {
                System.out.println("Please choose a correct option of either 1 or 2.");
            }
        }
         
        System.out.println("\n");
        // REMEMBER TO ALWAYS CLOSE THE SCANNER
        scanner.close();
    }
    
}
