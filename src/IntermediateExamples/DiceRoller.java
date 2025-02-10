package IntermediateExamples;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    // DECLARE VARIABLES
    // GET NUMBER OF DICE FROM USER
    // CHECK TO SEE IF GREATER THAN 0
    // ROLL ALL DICE
    // GET TOTAL OR SUM
    // DISPLAY ASCII ART OF DICE
    public void DiceProgram() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userDiceChoice = 0;
        int total = 0;


        System.out.print("Enter the number of dice to roll: ");
        userDiceChoice = scanner.nextInt();

        if (userDiceChoice > 0) {
            for(int i = 0; i < userDiceChoice; i++) {
                int roll = random.nextInt(1, 7);
                System.out.println("You rolled a: " + roll);
                PrintDie(roll);
                total += roll;
            }
            System.out.println("Here is the total rolled: " + total);
        } else {
            System.out.println("Dice number has to be greater than 0.");
        }
        scanner.close();
    }

    void PrintDie(int roll) {
        String errorMessage = "User Choice was invalid.";
        String dice1 = """
                 _______
                |       |
                |   •   |
                |_______|
            """;

        String dice2 = """
                 _______
                |       |
                | •   • |
                |_______|
            """;

        String dice3 = """
                 _______
                |     • |
                |   •   |
                |_•_____|
            """;

        String dice4 = """
                 _______
                | •   • |
                |       |
                |_•___•_|
            """;

        String dice5 = """
                 _______
                | •   • |
                |   •   |
                |_•___•_|
            """;
        
        String dice6 = """
                 _______
                | •   • |
                | •   • |
                |_•___•_|
            """;

        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println(errorMessage);
        }
    }    
}
