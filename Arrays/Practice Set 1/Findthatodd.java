/*
Find that Odd.
Given an array of numbers of size (2*n+1).Shubham is unable to find the number which is present odd number of times.It is guaranteed that only one such number exists.Can you help Shubham in finding the number which is present odd number of times? 
*/ 

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[2*n+1];
        for(int i=0;i<2*n+1;i++){
            arr[i] = sc.nextInt();
        }
        int result = 0;
        for(int i=0;i<2*n+1;i++){
            result ^= arr[i];
        }
        
        System.out.println(result);
        sc.close();
    }
}