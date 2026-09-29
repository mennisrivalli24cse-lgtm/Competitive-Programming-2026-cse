import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Median {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int[] arr2=new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int i1=0;
        int i2=0;int index=0;
        int[] arr=new int[n+m];
        while(i1<n&&i2<m)
        {
            if(arr1[i1]<arr2[i2])
            {
                arr[index++]=arr1[i1++];
            }
            else{
                arr[index++]=arr2[i2++];
            }
        }
        while(i1<n)
        {
             arr[index++]=arr1[i1++];
        }
        while(i2<m)
        {
            arr[index++]=arr2[i2++];
        }
        float median=0;int mid=(n+m)/2;
        if((n+m)%2==0)
        {
            median=(float)(arr[mid]+arr[mid-1])/2;
        }
        else{
            median=(float)arr[mid];
        }
      System.out.println(median);        
    }
}
