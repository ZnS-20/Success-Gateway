/* Convert the given character to its equivalent integer without using inbuild function*/

public class StringtoInt{

	static int converttoInt(String s){
		int value = 0,sign = 1,i=0;
		if(s.charAt(0)=='+'||s.charAt(0)=='-'){
			if(s.charAt(0)=='-'){
				sign = -1;
			}
			i=1;
		}
		while(i<s.length()){
			value = value*10 + (s.charAt(i) - '0');
			i++;
		}
		return value*sign;
	}

	public static void main(String[] args) {
		String inp = args[0];
		int result = converttoInt(inp);
		System.out.println(result);
	}
}