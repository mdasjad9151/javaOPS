import java.util.Scanner;

public class min {
    public static void main(String args[]) {
        float a, b, c, smallest;

        Scanner obj = new Scanner(System.in);
        System.out.println("enter first number:");
        a = obj.nextFloat();
        System.out.println("enter second number:");
        b = obj.nextFloat();
        System.out.println("enter third number:");
        c = obj.nextFloat();
        if (a < b) {
            if (c < a) {
                smallest = c;
            } else {
                smallest = a;
            }
        } else {
            if (b < c) {
                smallest = b;
            } else {
                smallest = c;
            }
        }

        System.out.println(smallest + " is the smallest.");
    }

}
