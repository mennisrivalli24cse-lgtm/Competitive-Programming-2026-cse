import java.io.*;
import java.util.*;

public class Fact {
    public static int fact(int n){
        if(n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print(fact(a));
    }
}

