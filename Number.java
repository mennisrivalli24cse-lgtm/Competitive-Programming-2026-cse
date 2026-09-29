import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int i = sc.nextInt();
            int j = sc.nextInt();

            int start = Math.min(i, j);
            int end = Math.max(i, j);

            int maxCycle = 0;

            for (int n = start; n <= end; n++) {

                int num = n;
                int cycle = 1;

                while (num != 1) {
                    if (num % 2 == 0)
                        num /= 2;
                    else
                        num = 3 * num + 1;

                    cycle++;
                }

                if (cycle > maxCycle)
                    maxCycle = cycle;
            }

            System.out.println(i + " " + j + " " + maxCycle);
        }

        sc.close();
    }
}
