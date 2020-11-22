/* Reverese a String Word by Word.

Input:

Mohammad Anas

Output:

Anas Mohammad

*/

public class ReverseWordByWord{

	static String charToString(char []arr){
		String result = "";
		for(char c:arr){
			result=result.concat(c+"");
		}
		return result;
	}

	static String reverseString(char arr[]){
		int i=0,j=arr.length-1;
		while(i<j){
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return charToString(arr);
	}

	public static void main(String[] args) {
		String whole = args[0];
		String word[] = whole.split(" ");
		String result = "";
		for(int i=0;i<word.length;i++){
			word[i] = reverseString(word[i].toCharArray());
			result = result.concat(word[i])+" ";
		}
		result = reverseString(result.toCharArray());
		System.out.println(result.substring(1,result.length()));
	}
}