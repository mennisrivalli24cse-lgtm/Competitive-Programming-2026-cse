import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Hashtable<Character,Integer> ht=new Hashtable<>();
        for(int i=0;i<str.length();i++)
        {
            if(ht.containsKey(str.charAt(i)))
            {
                ht.put(str.charAt(i),ht.get(str.charAt(i))+1);
            }
            else{
                ht.put(str.charAt(i),1);
            }
        } 
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ht.get(ch)>=2)
            {
                System.out.print(ch+" ");
                ht.put(ch,0);
            }
        }
        
    }
}
