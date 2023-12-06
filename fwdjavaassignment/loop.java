import java.util.Scanner;

public class loop {
    public static void main(String args[]) {
        int N, k;
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER you want to print: ");
        k = obj.nextInt();
        System.out.println("ENTER THE NUMBER OF TIMES YOU WANT TO PRINT: ");

        N = obj.nextInt();
        System.out.println("...........................................");
        for (int i = 0; i <= N; i++) {
            System.out.println(k);
        }

    }

}
