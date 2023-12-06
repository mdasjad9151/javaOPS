import java.util.Scanner;

public class swap {
    public static void main(String args[]) {
        int a, b;
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER: ");
        a = obj.nextInt();
        System.out.println("ENTER THE SECOND NUMBER: ");
        b = obj.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("sWapped variables are: ");
        System.out.println(a);

        System.out.println(b);

    }
}
