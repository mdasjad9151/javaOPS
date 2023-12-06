import java.util.Scanner;

public class StringComparison {
    public static void main(String args[]) {
        String a, b;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the 1st string");
        a = obj.nextLine();
        System.out.println("Enter the 2nd string");
        b = obj.nextLine();
        System.out.println("Are the two strings equal?: " + a.equals(b));
    }
}
