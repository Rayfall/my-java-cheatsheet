package IntermediateExamples;
import java.util.Scanner;

public class MadLibs {
    public void Madlibs() {
        Scanner scanner = new Scanner(System.in);
        
        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;        
        String verb1;

        System.out.println("Enter an adjective (A Description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun (A person, place, or thing): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter a verb ending with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.println("Enter a second adjective (A Description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a third adjective (A Description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today, I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();
    }    
}