package SlotMachine;

import java.util.Random;
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
        String playerAnswer = "";

        DisplayMessage();

        while(balance > 0) {
            System.out.println("Current Balance: $" + balance);

            System.out.print("Place your bet: ");
            bet = scanner.nextInt();
            scanner.nextLine();

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
            row = SpinSlot();

            PrintRow(row);
            payout = Payout(row, bet);

            if(payout > 0) {
                System.out.println("Congratulations! You won: $" + payout);
                balance += payout;
            } else {
                System.out.println("Better luck next time...");
            }

            System.out.print("Would you like to spin again? (Y / N): ");
            playerAnswer = scanner.nextLine().toUpperCase();

            if(!playerAnswer.equals("Y")) {
                break;
            }
        }

        System.out.println("Thank you for playing! Final balance: $" + balance);

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
        String[] symbols = {"🍒", "🍋", "🍉", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        //System.out.println(symbols[random.nextInt(symbols.length)]);

        for(int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    public void PrintRow(String[] row) {
        System.out.println(" " + String.join(" | ", row));
    }

    public int Payout(String[] row, int bet) {
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]) {
                case "🍒" -> bet * 4;
                case "🍋" -> bet * 8;
                case "🍉" -> bet * 12;
                case "🔔" -> bet * 20;
                case "⭐" -> bet * 40;
                default -> 0;
            };
        } else if ((row[0].equals(row[1])) || (row[1].equals(row[2])) || row[0].equals(row[2])) {
            if(row[0].equals(row[1]) || row[0].equals(row[2])) {
                return switch(row[0]) {
                    case "🍒" -> bet * 2;
                    case "🍋" -> bet * 4;
                    case "🍉" -> bet * 6;
                    case "🔔" -> bet * 10;
                    case "⭐" -> bet * 20;
                    default -> 0;
                };
            } else {
                return switch(row[1]) {
                    case "🍒" -> bet * 2;
                    case "🍋" -> bet * 4;
                    case "🍉" -> bet * 6;
                    case "🔔" -> bet * 10;
                    case "⭐" -> bet * 20;
                    default -> 0;
                };
            }
            
        } else {
            return 0;
        }        
    }
}
