import java.util.Scanner;

public class CheckArray {
    public static void main(String[] args) {
        int i, k;

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
            if (a[0] == a[k - 1]) {
                System.out.println("FIRST AND LAST ELEMENTS ARE SAME...");
                break;

            } else {
                System.out.println("elemnts are not same....");

            }

        }

    }
}
