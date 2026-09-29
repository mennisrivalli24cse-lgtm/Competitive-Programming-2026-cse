import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class String {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Hashtable<Character,Integer> ht=new Hashtable<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ht.containsKey(ch))
            {
                ht.put(ch,(ht.get(ch))+1);
            }
            else{
                ht.put(ch,1);
            }
        }
        int max=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ht.get(ch)>max)
            {
               max=ht.get(ch); 
            }
        }
        System.out.print(max);
    }
}
