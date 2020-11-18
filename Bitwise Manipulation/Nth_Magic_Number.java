/* Find the Nth Magic Number

A magic number is defined as a number which can be expressed as a power of any number(let say 5) or sum of unique power of that number.

let n=5
then the magic numbers are = 5,25,30,125,130 and so on.

Input:
5
4

Output:
125

*/
import java.util.Scanner;

public class Nth_Magic_Number{

	static int getBinary(int n){
		int binary = 0,pos=1;
		while(n!=0){
			int temp = n%2;
			n = n/2;
			binary += temp*pos;
			pos = pos*10;
		}
		return binary;
	}

	static void calculateMagicNumber(int number, int binary){
		double result = 0.0,pos=1.0;
		while(binary!=0){
			int temp = binary%10;
			binary = binary/10;
			if(temp==0){
				pos++;
			}else{
				result += Math.pow(number,pos);
				pos++;
			}
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int position = sc.nextInt();
		int binary = getBinary(position); //we can also use Integer.toBinaryString();
		calculateMagicNumber(number,binary);
	}
}