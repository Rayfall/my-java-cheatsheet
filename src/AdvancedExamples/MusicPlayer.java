package AdvancedExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer {
    public void Player() {
        // Audio on the AIS with Java supports .wav, .au, .aiff
        String filePath = " ";
        File file = new File(filePath);
        Scanner scanner = new Scanner(System.in);

        try(AudioInputStream audio = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();

            clip.open(audio);
            // clip.start();

            String response = "";

            while(!response.equals("Q")){
                DisplayMusicMenu();
                System.out.print("Enter your choice: ");
                response = scanner.next().toUpperCase();

                switch(response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice.");
                }
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Could not locate file.");
        }
        catch(UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported.");
        }
        catch(LineUnavailableException e) {
            System.out.println("Audio file is inaccessible.");
        }
        catch(IOException e) {
            System.out.println("Something went wrong...");
        }
        finally{
            System.out.println("Closing Program...");
            scanner.close();
        }
    }
    
    public void DisplayMusicMenu() {
        System.out.println("P = Play");
        System.out.println("S = Stop");
        System.out.println("R = Reset");
        System.out.println("Q = Quit");
    }
}
