import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class BucketSort {
    public static void bucketSort(double[] arr, int n) {
        if (n <= 0) return;

        // 1. Create N empty buckets
        ArrayList<Double>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // 2. Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            // Multiply by n to find the bucket index
            int bucketIndex = (int) (arr[i] * n);
            
            // Handle edge cases where index might go out of bounds
            if (bucketIndex >= n) {
                bucketIndex = n - 1;
            } else if (bucketIndex < 0) {
                bucketIndex = 0;
            }
            
            buckets[bucketIndex].add(arr[i]);
        }

        // 3. Sort individual buckets and merge them back
        int index = 0;
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check if there is input available
        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        
        scanner.close();

        // Perform Bucket Sort
        bucketSort(arr, n);

        // Print the sorted array rounded to 2 decimal places
        for (int i = 0; i < n; i++) {
            // Using Locale.US to ensure a dot '.' is used as a decimal separator
            System.out.printf(Locale.US, "%.2f", arr[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
