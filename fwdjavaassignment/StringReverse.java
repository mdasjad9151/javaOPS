import java.util.Scanner;

public class StringReverse {

    public static void main(String args[]) {
        String str;
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter a  string: ");
        str = sr.nextLine();
        String rev = "";
        int i = 0;
        int len = str.length();
        for (i = len; i > 0; i--) {
            rev += str.charAt(i - 1);
            
        }
        System.out.println("YOUR reversed string is: " + rev);
    sr.close();
    }
}
