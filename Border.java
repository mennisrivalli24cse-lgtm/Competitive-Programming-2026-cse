import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Border {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s1=" ";
        for(int i=1;i<str.length();i++)
        {
           String sub1 = str.substring(0, i);
             String sub2 = str.substring(str.length() - i);

            if(sub1.equals(sub2)&&str.length()!=sub1.length())
            {
                s1=sub1;
            }
        }
        System.out.print(s1);
    }
}
