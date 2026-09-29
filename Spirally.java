import java.util.Scanner;

public class Spirally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long[][] matrix = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextLong();
            }
        }

        
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        StringBuilder sb = new StringBuilder();
        boolean first = true;

        
        while (top <= bottom && left <= right) {

            for (int j = left; j <= right; j++) {
                if (!first) sb.append(" ");
                sb.append(matrix[top][j]);
                first = false;
            }
            top++;

        
            for (int i = top; i <= bottom; i++) {
                if (!first) sb.append(" ");
                sb.append(matrix[i][right]);
                first = false;
            }
            right--;

            // 3. Traverse Right to Left across the bottom row
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    if (!first) sb.append(" ");
                    sb.append(matrix[bottom][j]);
                    first = false;
                }
                bottom--;
            }

            // 4. Traverse Bottom to Top along the left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    if (!first) sb.append(" ");
                    sb.append(matrix[i][left]);
                    first = false;
                }
                left++;
            }
        }

        // Print the result separated by spaces
        System.out.println(sb.toString());
    }
}
