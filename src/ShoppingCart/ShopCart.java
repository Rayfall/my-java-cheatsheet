package ShoppingCart;
import java.util.Scanner;

public class ShopCart {
    public void ShoppingCart() {
        Scanner scanner = new Scanner(System.in);

        String item = ""; // I like to initialize my variables for just in case.
        double price = 0.0;
        int quantity = 0;
        char currency = '$';
        double total = 0.0;

        System.out.println("What item would you like to buy? ");
        item = scanner.nextLine();

        System.out.print("What is the price for each? ");
        price = scanner.nextDouble();

        System.out.print("How many would you like? ");
        quantity = scanner.nextInt();

        total = quantity * price;
        System.out.println("\nYour total is: " + currency + total + " for " + item);

        scanner.close();
    }
    
}
