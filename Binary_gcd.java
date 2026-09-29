import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Binary_gcd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();int count=1;
       while((a%2==0||b%2==0)&&(a>0&&b>0))
       {
         if(a%2==0)
         {
          a=a/2;
          if(b%2==0)
          {
             count=count*2;
          }
         }
         if(b%2==0)
         {
           b=b/2;
         }
       }
       while(a!=b)
       {
        if(a<b)
        {
          b=(b-a)/2;
        }
        else
        {
          a=(a-b)/2;
        }
        while(a%2==0)
        {
          a=a/2;  
         }
         while(b%2==0)
         {
           b=b/2;
         }
       }
       count=count*a;
       
       System.out.print(count);
    }
}
