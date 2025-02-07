package SlotMachine;

import java.util.Scanner;

public class SlotMachine {
    // DECLARE VARIABLES
    // DISPLAY A WELCOME MESSAGE
    // PLAY IF BALANCE IS GREATER THAN 0
    // USER WILL ENTER AN AMOUNT
    //      VERIFY IF BET IS GREATER THAN 0
    //      VERIFY IF BET IS GREATER THAN BALANCE
    //      SUBTRACT BET FROM BALANCE
    // SPIN ROW
    // DISPLAY ROW
    // GET PAYOUT
    // ASK TO PLAY AGAIN
    // IF NO, DISPLAY EXIT MESSAGE
    public void Game() {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet = 0;
        int payout = 0;
        String[] row;

        DisplayMessage();

        while(balance > 0) {
            System.out.println("Current Balance: $" + balance);

            System.out.print("Place your bet: ");
            bet = scanner.nextInt();

            if (bet > balance) {
                System.out.println("Insufficient funds.");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            } else {
                balance -= bet;
            }

            System.out.println("Spinning....");

            SpinSlot();
        }


        scanner.close();
    }

    public void DisplayMessage() {
        System.out.println("*******************************");
        System.out.println("     Welcome to Java Slots!    ");
        System.out.println("Symbols: 🍒 | 🍋 | 🍉 | 🔔 | ⭐");
        System.out.println("*******************************");
        System.out.println("");
    }
    
    public String[] SpinSlot() {

        return String[];
    }
}
