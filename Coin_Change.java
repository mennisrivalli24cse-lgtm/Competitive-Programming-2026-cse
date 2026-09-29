import java.io.*;
import java.util.*;

public class Coin_Change {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int N = sc.nextInt();

        int[] coins = new int[N];

        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt();
        }

        Hashtable<Integer, Integer> ht1 = new Hashtable<>();
        Hashtable<Integer, Integer> ht2 = new Hashtable<>();

        ht1.put(0, 0);

        for (int i = 1; i <= V; i++) {
            ht1.put(i, Integer.MAX_VALUE);
        }

        for (int i = 0; i < N; i++) {
            int coin = coins[i];

            for (int j = coin; j <= V; j++) {

                if (ht1.get(j - coin) != Integer.MAX_VALUE) {

                    int value = ht1.get(j - coin) + 1;

                    if (value < ht1.get(j)) {
                        ht1.put(j, value);
                        ht2.put(j, coin);
                    }
                }
            }
        }

        if (ht1.get(V) == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(ht1.get(V));

           /* while (V > 0) {
                System.out.print(ht2.get(V) + " ");
                V = V - ht2.get(V);
            }*/
        }
    }
}
