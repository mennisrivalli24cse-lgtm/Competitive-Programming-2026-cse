import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Rotten {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }int c=0;int t=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                c=0;
                if(arr[i][j]==2)
                {
                    if(i+1<n)
                    {
                        if(arr[i+1][j]==1)
                        {
                      arr[i+1][j]=2;
                      c=1;  
                        }
                    }
                    if(i-1>=0)
                    {
                        if(arr[i-1][j]==1)
                        {
                        arr[i-1][j]=2;
                        c=1;
                        }
                    
                    }
                    if(j-1>=0)
                    {
                        if(arr[i][j-1]==1)
                        {
                        arr[i][j-1]=2;
                        c=1;
                        }
                    }
                    if(j+1<n)
                    {
                        if(arr[i][j+1]==1)
                        {
                        arr[i][j+1]=2;
                        c=1;
                        }
                    }
                    if(c==1)
                    {
                        t++;
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==1)
                {
                    System.out.print("-1");
                    return;
                }
            }
        }
        System.out.print(t);
    }
}
