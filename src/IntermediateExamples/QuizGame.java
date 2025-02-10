package IntermediateExamples;

import java.util.Scanner;

public class QuizGame {
    // ARRAY OF QUESTIONS
    // OPTIONS FOR EACH QUESTION, 2D ARRAY
    // DECLARE VARIABLES
    // WELCOME MESSAGE
    // LIST EACH QUESTION, USING A LOOP
    // IN THE LOOP, WE WILL:
    //      LIST OPTIONS
    //      GET GUESS FROM USER
    //      CHECK OUR GUESS TO SEE IF CORRECT
    // DISPLAY FINAL SCORE
    public void Game() {
        Scanner scanner = new Scanner(System.in);
        
        int score = 0;
        int guess = 0;

        String[] questions = {"What is the main function of a router?",
            "Which part of the computer is considered the brain?",
            "What year was Facebook launched?",
            "Who is known as the father of computers?",
            "what was the first programming language?",
        };

        String[][] options = {{"1. Storing Files", "2. Encrypting Data", "3. Directing Internet Traffic", "4. Managing Passwords"},
            {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
            {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
            {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
            {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}
        };

        int[] answers = {3, 1, 2, 4, 3};

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]) {
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
                score++;
            } else {
                System.out.println("******");
                System.out.println("Wrong!");
                System.out.println("******");
            }
        }
        System.out.println("Your final score: " + score);
        scanner.close();
    }
}
