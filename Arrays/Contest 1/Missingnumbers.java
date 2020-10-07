/* Missing Numbers

Numeros the Artist had two lists that were permutations of one another. He was very proud. Unfortunately, while transporting them from one exhibition to another, some numbers were lost out of the first list. Can you find the missing numbers?
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {
    	HashMap<Integer,Integer> freq = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            if(freq.containsKey(key)){
                int value = freq.get(key);
                freq.put(key,value+1);
            }
            else{
                freq.put(key,1);
            }
        }
        for(int i=0;i<brr.length;i++){
            int key = brr[i];
            if(freq.containsKey(key)){
                int value = freq.get(key);
                freq.put(key,value-1);
            }
            else{
                freq.put(key,1);
            }
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue() !=0){
                arr[count] = entry.getKey();
                count++;
            }
        }
        arr = Arrays.copyOfRange(arr,0,count);
        Arrays.sort(arr);
        return arr;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        int[] result = missingNumbers(arr, brr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}