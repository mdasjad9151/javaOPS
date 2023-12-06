import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        int a, b = 0;
        System.out.println("ENTER THE THE NUMBER TO CHECK FOR PRIME:  ");
        a = ob.nextInt();
        if (a == 0 || a == 1) {
            System.out.print("a composite number...");
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(a + " is non prime");
                b = 1;
                break;
            }

        }
        if (b == 0) {
            System.out.println(a + " is prime");

        }

    }

}
