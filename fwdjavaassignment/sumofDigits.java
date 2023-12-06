import java.util.Scanner;

public class sumofDigits {
    public static void main(String args[]) {
        int a, sum = 0;
        Scanner obj = new Scanner(System.in);

        System.out.println("enter the number :");
        a = obj.nextInt();
        while (a > 0) {
            int R = a % 10;
            sum = sum + R;
            a = a / 10;
        }
        System.out.println("sum of its digit is :" + sum);
    }
}
