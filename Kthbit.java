import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kthbit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = (n & (1 << m));
        if(result != 0)
            System.out.print(1);
        else
            System.out.print(0);
    }
}
