import java.io.*;
import java.util.*;

public class Extended {
    static int x,y;
    public static int gcd(int A,int B){
        if(B==0){
            x=1;y=0;
            return A;
        }
        int res=gcd(B,A%B);
        int temp=x;
        x=y;
        y=temp-(A/B)*y;
        return res;
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int res=gcd(a,b);
        System.out.print(x+" "+y+" "+res);
    }
}
