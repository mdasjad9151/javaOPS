import java.util.Scanner;

public class sumSeries {
    public static void main(String args[]) {
        int N;
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER UPTO WHICH YOU want to calculate the sum ...");
        N = obj.nextInt();
        int sum = (N * (N + 1)) / 2;
        System.out.println("SUM IS: " + sum);

    }
}
