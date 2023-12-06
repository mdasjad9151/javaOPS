import java.util.Scanner;

public class sumofArray {
    public static void main(String[] args) {
        int i, k;

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elemnts of Array..: ");
        k = sc.nextInt();
        int a[] = new int[k];
        for (i = 0; i < k; i++) {

            System.out.println("Enter number at " + i + " position");
            a[i] = sc.nextInt();
        }
        System.out.println("YOUR ARRAY IS: ");
        for (i = 0; i < k; i++) {
            System.out.println(" " + a[i]);
            sum = sum + a[i];

        }
        System.out.print("  ");
        System.out.print("sum is : " + sum);

    }
}
