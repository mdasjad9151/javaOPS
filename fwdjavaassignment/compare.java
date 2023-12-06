import java.util.Scanner;

public class compare {
    public static void main(String args[]) {
        float a, b;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the first numberr");
        a = obj.nextFloat();
        System.out.println("enter the second numberr");
        b = obj.nextFloat();
        if (a == b) {
            System.out.println("BOTH NUMBERS ARE EQUAL..");

        } else {
            System.out.println("BOTH ARE NOT EQUAL..");
        }
    }
}
