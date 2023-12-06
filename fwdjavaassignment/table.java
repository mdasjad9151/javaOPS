import java.util.Scanner;

public class table {
    public static void main(String args[]) {
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number :");
        a = obj.nextInt();
        System.out.println("YOUR TABLE OF " + a + " IS: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("" + a + "*" + i + "=" + a * i);
        }
        System.out.println("......END......");
    }
}