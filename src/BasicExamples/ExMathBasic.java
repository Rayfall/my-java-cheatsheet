package BasicExamples;

import java.util.Scanner;

public class ExMathBasic {
    // Math.max(x, y)   // Finds the max of a value.
    // Math.min(x, y)   // Finds the min of a value.
    // Math.abs(x)      // Gets the absolute of a value.
    // Math.sqrt(x)     // Finds the square root of a variable.
    // Math.round(x)    // Rounds variable to the nearest decimal place.
    // Math.ceil(x)     // Rounds variable up.
    // Math.floor(x)    // Rounds variable down.

    public void RunExample() {
        double x = 3.14;
        double y = -10;
        double z = 0;

        z = Math.max(x, y);
        System.out.println(z);

        z = Math.min(x, y);
        System.out.println(z);

        z = Math.abs(y);
        System.out.println(z);

        z = Math.sqrt(Math.abs(y));
        System.out.println(z);

        z = Math.round(x);
        System.out.println(z);

        z = Math.ceil(x);
        System.out.println(z);

        z = Math.floor(x);
        System.out.println(z);
    }
    
    public void RunExampleHypo() {
        double x;
		double y;
		double z;		

		Scanner scanner = new Scanner(System.in);				

		System.out.println("Enter side x: ");
		x = scanner.nextDouble();

		System.out.println("Enter side y: ");
		y = scanner.nextDouble();		

		z = Math.sqrt((x*x)+(y*y));		

		System.out.println("The hypotenuse is : "+z);
		scanner.close();
    }
    
}
