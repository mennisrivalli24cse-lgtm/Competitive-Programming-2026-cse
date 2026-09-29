import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Majority {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Hashtable<Integer,Integer> ht=new Hashtable<>();
        for(int i=0;i<n;i++)
        {
            if(!ht.containsKey(arr[i]))
            {
              ht.put(arr[i],1);  
            }
            else
            {
                ht.put(arr[i],ht.get(arr[i])+1);
            }
        }int max=-1;
        for(int i=0;i<n;i++)
        {
            if(ht.get(arr[i])>n/2)
            {
                max=arr[i];
            }
        }
        System.out.print(max);
    }
}
