import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfDays;
        double sum = 0;

        System.out.print("Enter the number of days to be recorded: ");
        numOfDays = input.nextInt();

        double[] temps = new double[numOfDays];

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Enter the temperature for Day " + (i+1) + ": ");
            temps[i] = input.nextDouble();
        }

        for (double store : temps) {
            sum += store;
        }

        double ave = sum / temps.length;

        System.out.println("\nDays Recorded: " + temps.length);
        System.out.println("Daily Average Temperature: " + ave + "°C");

        input.close();
    }
}
