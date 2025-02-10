package IntermediateExamples;

import java.util.Scanner;

public class BankingProgram {
    // Variable Declaration
    Scanner scanner = new Scanner(System.in);
    double balance = 0.0;
    boolean isRunning = true;
    int choice = 0; // 1 to show balance, 2 to deposit, 3 to withdraw, 4 to exit.

    public void BankProgram() {
     
     
     MenuDisplay();

     while(isRunning){
        System.out.print("\nPlease choose your option (1 - 4): ");
        choice = scanner.nextInt();

        UserChoice(choice);
     }
     
     
     System.out.println("Program is Terminating...");

     scanner.close();
    }

    public void MenuDisplay() {
        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");

        System.out.println("01. Show Balance");
        System.out.println("02. Deposit");
        System.out.println("03. Withdrawal");
        System.out.println("04. Quit Program");

        System.out.println("***************");
    }

    public void ShowBalance(double userBalance) {
        System.out.println("***************");
        System.out.printf("Balance Shown: $%.2f\n", userBalance);
    }

    public double Deposit() {
        double amount = 0.0;

        System.out.println("***************");
        System.out.println("Balance Deposit.");

        System.out.print("Please Enter Deposit Amount: ");
        amount = scanner.nextDouble();

        if(amount < 0) {
            System.out.println("Amount cannot be $0");
            return 0.0;
        } else {
            return amount;
        }        
    }

    public double Withdrawal() {
        double amount = 0.0;

        System.out.println("***************");
        System.out.println("Balance Withdrawal.");

        System.out.print("Please Enter Withdrawal Amount: ");
        amount = scanner.nextDouble();

        if(amount < 0) {
            System.out.println("Amount cannot be $0");
            return 0.0;
        } else if(amount > balance) {
            System.out.println("Currently, not enough funds to withdraw.");
            return 0.0;
        } else {
            return amount;
        }
    }

    public void QuitProgram() {
        System.out.println("Thank you for using the Banking Program.");
        isRunning = false;
    }

    public void UserChoice(int userChoice) {
        switch(userChoice) {
            case 1 -> ShowBalance(balance);
            case 2 -> balance += Deposit();
            case 3 -> {
                balance -= Withdrawal();
                System.out.printf("Current balance is now: $%.2f\n", balance);
            }
            case 4 -> QuitProgram();
            default -> System.out.println("Choice invalid. Please try again.");
        }
    }
}
