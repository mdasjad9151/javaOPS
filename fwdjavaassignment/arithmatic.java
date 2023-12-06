import java.util.Scanner;

public class arithmatic {
    public static void main(String args[]) {
        int a, b, add, diff, mul;
        float div, mod;
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter first number");
        a = obj1.nextInt();
        System.out.println("Enter second nymber");
        b = obj1.nextInt();
        add = a + b;
        System.out.println("Addition=" + add);
        diff = a - b;
        System.out.println("Subtraction=" + diff);
        mul = a * b;
        System.out.println("multiplication=" + mul);
        div = a / b;
        System.out.println("division=" + div);
        mod = a % b;
        System.out.println("remainder=" + mod);
    }

}
