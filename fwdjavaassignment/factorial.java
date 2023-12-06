import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        int i, n, fact = 1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number you want to get Fcatorial of :");
        n = obj.nextInt();

        // It is the number to calculate factorial
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
