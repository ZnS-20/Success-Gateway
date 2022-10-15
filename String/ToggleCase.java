import java.util.Scanner;

import java.util.Scanner;

class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                stringBuilder.append(' ');
                continue;
            }
            if (c >= 65 && c <= 91) {
                c = (char) (c + ' ');
                stringBuilder.append(c);
            } else {
                c = (char) (c - ' ');
                stringBuilder.append(c);
            }
        }
        System.out.println(stringBuilder.toString());
    }
}