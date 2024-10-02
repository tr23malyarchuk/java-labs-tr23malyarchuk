// Визначити, чи утворюють значення елементів вихідного одновимірного
// масиву a: строго зростаючу послідовність (ai < ai+1), строго спадну
// послідовність (ai > ai+1) або елементи масиву не впорядковані, і вивести
// для кожного випадку відповідне повідомлення.

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("An array must contain at least two elements.");
            return;
        }

        int[] a = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        String result = checkSequence(a);
        System.out.println(result);
        scanner.close();
    }

    public static String checkSequence(int[] a) {
        if (isStrictlyIncreasing(a)) {
            return "The array is strictly increasing.";
        } else if (isStrictlyDecreasing(a)) {
            return "The array is strictly decreasing.";
        } else {
            return "The elements of the array are not in sequence.";
        }
    }

    private static boolean isStrictlyIncreasing(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] >= a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isStrictlyDecreasing(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] <= a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
