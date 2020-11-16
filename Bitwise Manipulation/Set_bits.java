/* The Problem is to find the number of set bits in binary pattern of a number

Input:
6

Output:

2

Explanation:-
6 in binary is 0110 so the total set bits are 2.

*/

import java.util.Scanner;

class Set_bits{

	static void toogle_countbits(int n){
		int count=0;
		while(n!=0){
			count++;
			n=n&(n-1);
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// Using Toggling method which will give time complexity = O(number of set bits).
		toogle_countbits(n);
	}
}