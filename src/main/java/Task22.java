import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task22 {
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

        int[] b = formIndexArray(a);
        System.out.print("Array of indices in decreasing order: ");
        for (int index : b) {
            System.out.print(index + " ");
        }

        scanner.close();
    }

    public static int[] formIndexArray(int[] a) {
        Integer[] indices = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer index1, Integer index2) {
                return Integer.compare(a[index2], a[index1]);
            }
        });

        return Arrays.stream(indices).mapToInt(Integer::intValue).toArray();
    }
}
