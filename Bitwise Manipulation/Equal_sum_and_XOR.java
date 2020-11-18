/* The problem is to count the number of +ve integers i such that 0<=i<=n and n+i ~ n^i (^ is XOR)

Input:
7
Output:
1
Explanation:
n=7	

7+0 = 7				7^0 = 7
7+1 = 8				7^1 = 6
and so on till		and so on till 
7+7 = 14			7^7 = 0

then the value of i = 1

*/

import java.util.Scanner;

public class Equal_sum_and_XOR{

	static int getTotalBits(int n){
		int count = 0;
		while(n!=0){
			count++;
			n = n/2;
		}
		return count;
	}
	static int getTotalSetBits(int n){
		return Integer.bitCount(n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Math.pow(2,(getTotalBits(n)-getTotalSetBits(n))));
	}
}