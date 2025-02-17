package AdvancedExamples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangManGame {
    String word = "light";
    int choice = 0;
    String filePath = "./hangmanswords/words.txt";

    public void Game() {
        ArrayList<Character> wordState = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                words.add(line.trim());
            };

        } catch(FileNotFoundException e) {
            System.out.println("Could not find file. Using starting word instead.");
            choice = 1;
        } catch(IOException e) {
            System.out.println("Something went wrong...");
            choice = 1;
        }

        Random random = new Random();
        
        if(!(choice == 1)) {
            word = words.get(random.nextInt(words.size()));
        }
        
        Scanner scanner = new Scanner(System.in);
        
        int wrongGuesses = 0;

        for(int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        WelcomeMessage();

        while(wrongGuesses < 6) {
            DisplayWordList(wordState);

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0) {
                System.out.println("Guess Correct!");

                for(int i = 0; i < word.length(); i++) {
                    if(word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                if(!wordState.contains('_')) {
                    System.out.println(getHangManArt(wrongGuesses));
                    System.out.println("Game Over! You win!!");
                    System.out.println("The word was: " + word);

                    break;
                }
            } else {
                wrongGuesses++;
                System.out.println("Incorrect.");
                System.out.println(getHangManArt(wrongGuesses));
            }

        }
        
        if(wrongGuesses >= 6) {
            System.out.println("Game Over!");
            System.out.println("The word was: " + word);
        }

        scanner.close();

    }
    
    public void WelcomeMessage() {
        System.out.println("*****************************");
        System.out.println("Welcome to the Hang Man Game!");
        System.out.println("*****************************");
    }

    public String getHangManArt(int wrongGuesses) {

        return switch(wrongGuesses) {
            case 0 -> """

            
            
                      """;
            case 1 -> """
                       o
                        
                        
                      """;
            case 2 -> """
                       o
                       |
                         
                      """;
            case 3 -> """
                       o
                      /|
                         
                      """;
            case 4 -> """
                       o
                      /|\\
                          
                      """;
            case 5 -> """
                       o
                      /|\\
                      /    
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\ 
                      """;
            default -> "";
        };
    }

    public void DisplayWordList(ArrayList<Character> list) {
        System.out.print("Word: ");

        for(char c : list) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public void placeholder() {

    }
}
