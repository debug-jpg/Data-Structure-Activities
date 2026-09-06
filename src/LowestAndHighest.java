import java.util.Scanner;

public class LowestAndHighest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;

        System.out.print("Enter a number: ");
        size = input.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1) + ". Enter a value: ");
            array[i] = input.nextInt();
        }

        int lowest = array[0];
        int highest = array[0];

        for (int value : array) {
            if (value < lowest) {
                lowest = value;
            }
            if (value > highest) {
                highest = value;
            }
        }

        System.out.println("\nLowest Value: " + lowest);
        System.out.println("Highest Value: " + highest);
    }
}
