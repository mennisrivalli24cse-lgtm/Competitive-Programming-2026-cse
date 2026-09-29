import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Div_Bin {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int low=0;int high=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(mid*m==n)
            {
                System.out.print(mid);
                return;
            }
            else if(mid*m>n)
            {
                high=mid-1;
            }
            else 
            {
                low=mid+1;
            }
        }
        System.out.print("-1");
        
    }
}
