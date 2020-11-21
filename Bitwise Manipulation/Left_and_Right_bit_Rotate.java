/* Rotate bit of a number 'n' by 'd' bits.

Input:
229
3 // value of d.
l //for left rotate('l' for left rotate and 'r' for right rotate).

Output:
00101111

Explanation:

Binary of 229 is 11100101 then rotation first 3 bits i.e, 111 to its right most.
*/

import java.util.Scanner;

public class Left_and_Right_bit_Rotate{

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int k = 32;
		char ch = Character.toLowerCase(sc.next().charAt(0));
		switch(ch){
			case 'l':System.out.println(Integer.toBinaryString((n<<d)|(n>>(k-d))));
					 break;

			case 'r':System.out.println(Integer.toBinaryString((n>>d)|(n<<(k-d))));
					 break;
		}
	}
}