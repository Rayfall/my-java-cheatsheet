package IntermediateExamples;

import java.util.Scanner;

public class EnhancedCalculator {
    // Even though this is program is labeled EnhancedCalculator, it only performs the basic operations.
    // This program is meant to show off enhanced switch statements. I will be commenting out the regular switch case statements.
    public void CalcProgram() {
        Scanner scanner = new Scanner(System.in);

        double number1 = 0.0;
        double number2 = 0.0;
        char operator = ' ';
        double result = 0.0;
        String errorMessage = "";

        System.out.print("Enter the first number: ");
        number1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        number2 = scanner.nextDouble();

        /* Regular Switch Case Example */
        /* 
        switch(operator) {
            case '+': result = number1 + number2;
                break;
            case '-': result = number1 - number2;
                break;
            case '*': result = number1 * number2;
                break;
            case '/': result = number1 / number2;
                break;
            case '^': result = Math.pow(number1, number2);
                break;
            default: System.out.print("\nIncorrect operator input, terminating program...");
        }
        */

        /* Enhanced Switch Case Example */
        switch(operator) {
        case '+' -> result = number1 + number2;
        case '-' -> result = number1 - number2;
        case '*' -> result = number1 * number2;
        case '/' -> {
            if(number2 == 0) {
                errorMessage = "Cannot divide by zero. Terminating program...";
            } else {
                result = number1 / number2;
            }
        }
        case '^' -> result = Math.pow(number1, number2);
        default -> errorMessage = "Incorrect operator input, terminating program...";
        }

        if(errorMessage.isEmpty()) {
            System.out.println(result);
        } else {
            System.out.println(errorMessage);
        }


        scanner.close();
    }
}
