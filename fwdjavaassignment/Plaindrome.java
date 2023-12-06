import java.util.*;

public class Plaindrome {
    public static void main(String args[]) {
        String str;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the  string");
        str = obj.nextLine();
        String rev = " ";
        int i = 0;
        int len = str.length();
        for (i = len; i > 0; i--) {
            rev += str.charAt(i - 1);
        }
        System.out.println(rev);

        if (str.toLowerCase().equals(rev.toLowerCase())) {
            System.out.println("HENCE THE STRING IS PALINDROM...");

        } else {
            System.out.println(" THE STRING IS not PALINDROM...");

        }
    }
}
