/* Pairs

You will be given an array of integers and a target value. Determine the number of pairs of array elements that have a difference equal to a target value.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pairs function below.
   static int pairs(int k, int[] arr) {
       HashMap<Integer,Integer> hash = new HashMap<>(); 
       for(int i=0;i<arr.length;i++){
        hash.put(arr[i],1);
       }
       int count = 0;
       for(int i=0;i<arr.length;i++){
           if(hash.get(k+arr[i])!=null){
               count += hash.get(k+arr[i]);
           }
       }
       return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = pairs(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}