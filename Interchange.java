


import java.io.*;
import java.util.*;

public class Interchange {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int index1=-1;
        int index2=-1;
        for(int i=0;i<a;i++){
             if(min>arr[i]){
                min=arr[i];
                index1=i;
             }
        }
        for(int i=0;i<a;i++){
             if(max<arr[i]){
                max=arr[i];
                index2=i;
             }
        }
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        for(int k=0;k<a;k++){
            System.out.print(arr[k]+" ");
        }
    }
}

