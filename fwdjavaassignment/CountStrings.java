import java.util.Scanner;

public class CountStrings {
    public static void main(String args[]) {
        String str;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the  string");
        str = obj.nextLine();
        char[] ch = str.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            }

        }
        System.out.println("LETTERS: " + letter);

        System.out.println("NUMBERS : " + num);

        System.out.println("SPACES: " + space);

    }
}
