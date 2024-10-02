import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();

        System.out.print("Amount of elements: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("An array includes at least 2 numbers.");
            scanner.close();
            return;
        }

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            try {
                values.add(scanner.nextInt());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
                i--;
            }
        }

        int minDiff = findLowestDifference(values);
        System.out.println("Lowest absolute difference: " + minDiff);
        scanner.close();
    }

    public static int findLowestDifference(ArrayList<Integer> values) {
        Collections.sort(values);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < values.size(); i++) {
            minDiff = Math.min(minDiff, Math.abs(values.get(i) - values.get(i - 1)));
        }
        return minDiff;
    }
}
