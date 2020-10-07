/*Missing number in array
You are given an array of 99 elements. The array is filled with integers from 1 to 100. Since there are only 99 elements in the array, one number will be left out. You are tasked with finding the integer that is missing.
*/ 
import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = 0, total = 0;
        for(int i=0;i<99;i++){
            input = input+ Integer.parseInt(br.readLine());
        }

        for(int i=1;i<=100;i++){
            total = total + i;
        }

        System.out.println(total - input);
    }
}