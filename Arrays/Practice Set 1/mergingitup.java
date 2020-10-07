/* Merging it up 
You are given two sorted arrays. First contains m elements in array of size of m+n.The second array of size n and contains n elements. You need to merge the two arrays into the bigger array WITHOUT USING THE THIRD ARRAY. Don't use ANY SORTING ALGORITHM.
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
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[] = new int[m+n];
        int brr[] = new int[n];
        for(int i=0;i<m;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            brr[i] = sc.nextInt();
        }
        int start = 0;
        for(int i=m;i<m+n;i++){
            arr[i] = brr[start];
            start++;
        }
        Arrays.sort(arr);
        for(int i=0;i<m+n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}