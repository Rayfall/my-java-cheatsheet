package IntermediateExamples;
import java.util.Scanner;

public class TemperatureConverter {
    public void TempConverter() {
        Scanner scanner = new Scanner(System.in);

        double originalTemperature = 0.0;
        double convertedTemperature = 0.0;
        String unit = " ";

        System.out.print("Enter the temperature: ");
        originalTemperature = scanner.nextDouble();

        System.out.print("Convert to Celcius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        convertedTemperature = (unit.equals("C")) ? (originalTemperature - 32) * 5 / 9 : (originalTemperature * 5 / 9) + 32;

        System.out.printf("Converted temperature is now: %.1f°%s", convertedTemperature, unit);
        System.out.println("\n");

        scanner.close();
    }
    
}
