import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in array a: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " numbers for array a:");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in array b: ");
        int m = scanner.nextInt();
        int[] b = new int[m];
        System.out.println("Enter " + m + " numbers for array b:");
        for (int i = 0; i < m; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            b[i] = scanner.nextInt();
        }

        findEqualElements(a, b);

        scanner.close();
    }

    public static void findEqualElements(int[] a, int[] b) {
        List<Integer> equalIndicesA = new ArrayList<>();
        List<Integer> equalIndicesB = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    equalIndicesA.add(i);
                    equalIndicesB.add(j);
                    count++;
                }
            }
        }

        System.out.println("Number of equal elements: " + count);
        for (int i = 0; i < count; i++) {
            System.out.println("Equal element found at a["
                    + equalIndicesA.get(i)
                    + "] and b[" + equalIndicesB.get(i)
                    + "]");
        }
    }
}
