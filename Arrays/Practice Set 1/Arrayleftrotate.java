/* Array Left Rotate
A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. Given an integer,d , rotate the array that many steps left and return the result.  */ 
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int[] reverseArray(int a[],int start,int end){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        reverseArray(a,0,d-1);
        reverseArray(a,d,n-1);
        reverseArray(a,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

        scanner.close();
    }
}

