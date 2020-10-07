/*Remove Duplicate from sorted Array*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int start = arr[0];
        for(int i=1;i<n;i++){
            int comp = arr[i];
            if(comp == start){
                count++;
            }
            start = comp;
        }
        System.out.println(n-count);
        sc.close();
    }
}
