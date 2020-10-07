/* Leader in array 2
Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i]. Print all the leader elements separated by space and in the same order they are present in the input array.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int max = a[n-1];
        arr.add(max);
        for(int i=n-2;i>=0;i--){
            if(a[i]>max){
                max = a[i];
                arr.add(max);
            }
        }
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
    }
}