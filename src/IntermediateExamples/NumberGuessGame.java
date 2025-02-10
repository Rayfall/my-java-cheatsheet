package IntermediateExamples;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public void NumberGuessingGame() {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int guess = 0;
        int attempts = 0;
        int min = 1;
        int max = 10;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a random number between %d-%d\n", min, max);

        while(!(guess == randomNumber)) {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();

            if(guess > randomNumber) {
                System.out.println("Guess is too HIGH");
            } else if (guess < randomNumber) {
                System.out.println("Guess is too LOW");
            } else {
                System.out.printf("Correct! Random number was %d\n", randomNumber);
            }

            attempts++;
        }

        System.out.printf("It took you %d guess(es)! Congratulations!\n", attempts);
        scanner.close();
    }
    
}
