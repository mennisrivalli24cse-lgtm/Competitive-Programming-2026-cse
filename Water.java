import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Water {
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int i1=sc.nextInt();
        int i2=sc.nextInt();
        int target=sc.nextInt();
        int gcd1=gcd(i1,i2);
        if(target%gcd1==0)
        {
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
        
    }
}
