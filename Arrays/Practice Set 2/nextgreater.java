/* Next Greater Element
Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in array. Elements for which no greater element exist, consider next greater element as -1.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int i=0,j=0;
        while(i<n){
            if(j>=n){
                System.out.println(a[i]+" -1");
                i++;
                j=i+1;
                continue;
            }
            if(a[j]>a[i]){
                System.out.println(a[i]+" "+a[j]);
                i++;
                j=i+1;
                continue;
            }
            j++;
        }
    }
}