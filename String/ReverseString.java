import java.util.Scanner;

public class ReverseString {

    public static char[] toCharArray(String str) {
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        return ch;
    }

    public static String charToString(char[] ch) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : ch) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        sc.close();
        char[] str = toCharArray(string);
        int start = 0, end = string.length() - 1;
        while (start < end) {
            char temp = str[start];
            str[start++] = str[end];
            str[end--] = temp;
        }
        string = charToString(str);
        System.out.println(string);
    }
}