import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Merge {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];int z=0;
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int right=0;
        int left=0;
        int[] arr=new int[n+m];
        while(right<n&&left<m)
        {
          if(arr1[right]<=arr2[left])
          {
            arr[z++]=arr1[right];
            right++;
          }  
          else{
            arr[z++]=arr2[left];
            left++;
          } 
        }
     while(right<n){
        arr[z++]=arr1[right];
            right++;
        
     }
     while(left<m){
         arr[z++]=arr2[left];
            left++;
     }
        for(int i=0;i<n+m;i++)
        {
            
        System.out.print(arr[i]+" ");
        }
    }
}
