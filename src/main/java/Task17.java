import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in array a: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        int[] b = calculateDifferences(a);
        printArray(b);

        scanner.close();
    }

    public static int[] calculateDifferences(int[] a) {
        int max = findMax(a);
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = max - a[i];
        }

        return b;
    }

    private static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static void printArray(int[] array) {
        System.out.print("Array b: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
