package IntermediateExamples;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    // DECLARE VARIABLES
    // GET A CHOICE FROM USER
    // GET RANDOM CHOICE FOR THE COMPUTER
    // CHECK WIN CONDITIONS
    // ASK TO PLAY AGAIN
    // DISPLAY GOODBYE MESSAGE
    public void Game() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice = "";
        String computerChoice = "";

        String playContinue = "Y";

        while(!(playContinue.equals("N"))) {
            System.out.print("Enter your move (rock, paper, or scissors): ");
            playerChoice = scanner.next().toLowerCase();
        
            if(!(playerChoice.equals("rock")) && 
            !(playerChoice.equals("paper")) && 
            !(playerChoice.equals("scissors"))) {
                System.out.println("Invalid Choice.");
                continue;
            }

            computerChoice = choices[random.nextInt(0, 3)];

            if(playerChoice.equals(computerChoice)) {
                System.out.println("It's a Draw!");
            } else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose! :'(");
            }
            
            System.out.print("Would you like to play again? (Y / N): ");
            playContinue = scanner.next().toUpperCase();

            while(!playContinue.equals("Y") && !playContinue.equals("N")) {
                System.out.print("Invalid answer. Would you like to play again? (Y / N): ");
                playContinue = scanner.next().toUpperCase();
            }
        }


        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
