import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tripltes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Arrays.sort(arr);
        int j=0;
      for(int i=0;i<n-2;i++)
        {
           int left=i+1;
            int right=n-1;
            while(left<right)
            {
                int sum=arr[i]+arr[right]+arr[left];
            if(sum==target)
            {
               System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
                left++;
                right--;
                j=1;
            }
            else if(sum<target)
            {
                left++;
            }
            else
            {
                right--;
            }
            }
        }
        if(j==0)
        {
            System.out.print("No Triplet Found");
        }
    }
}
