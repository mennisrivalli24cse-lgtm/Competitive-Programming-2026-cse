import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Max_asc {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];int j=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];int high=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            {
               max+=arr[i]; 
            }
            else{
                j=1;
               high=Math.max(high,max);
                max=arr[i-1];
            }
        }
        high=Math.max(high,max);
        System.out.print(high);
     
    }
}
