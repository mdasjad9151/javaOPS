import java.util.Scanner;

public class average {
    public static void main(String args[]) {
        int a, b, c;
        float avg;
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER: ");
        a = obj.nextInt();
        System.out.println("ENTER THE SECOND NUMBER: ");
        b = obj.nextInt();
        System.out.println("ENTER THE THIRD NUMBER: ");
        c = obj.nextInt();
        avg = (a + b + c) / 3;
        System.out.println("Average of the numbers is: " + avg);

    }

}
