import java.util.Scanner;

public class Thug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int[] weights = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
            sum += weights[i];
        }
        
       
        long[] dp = new long[sum + 1];
        

        dp[0] = 1L; 
        

        for (int i = 0; i < n; i++) {
            int w = weights[i];
            for (int j = sum; j >= w; j--) {
                if (dp[j - w] != 0) {
                    dp[j] |= (dp[j - w] << 1);
                }
            }
        }
        
        int minDiff = Integer.MAX_VALUE;
        int targetSize1 = n / 2;
        int targetSize2 = (n + 1) / 2;
        
        
        for (int w = 0; w <= sum; w++) {
            if (dp[w] != 0) {
                
                if (((dp[w] >> targetSize1) & 1) == 1 || ((dp[w] >> targetSize2) & 1) == 1) {
                    int currentDiff = Math.abs((sum - w) - w);
                    if (currentDiff < minDiff) {
                        minDiff = currentDiff;
                    }
                }
            }
        }
        
        System.out.println(minDiff);
        sc.close();
    }
}
