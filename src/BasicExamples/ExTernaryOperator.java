package BasicExamples;

public class ExTernaryOperator {
    // Ternary Operator ? = Return 1 of 2 Values if a condition is true.
    // variable = (condition) ? ifTrue : ifFalse;

    public void TernaryOperatorExample() {
        int grade = 73;
        String passOrFail = (grade >= 60) ? "PASS" : "FAIL";
        System.out.println("Grade of " + grade + " is: " + passOrFail);

        int number = 23;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println("Number of " + number + " is " + evenOrOdd);

        int hours = 13;
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println("Time of day is: " + timeOfDay);

        int income = 92000;
        double taxRate = (income >= 50000) ? 0.25 : 0.15;
        System.out.printf("\nTax Rate of income %d: %.2f", income, taxRate);

        System.out.println("\n");
    }
    
}
