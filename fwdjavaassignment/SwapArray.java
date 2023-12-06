import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        int i, k;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elemnts of Array : ");
        k = sc.nextInt();
        int c;
        int a[] = new int[k];
        for (i = 0; i < k; i++) {

            System.out.println("Enter number at " + i + " position");
            a[i] = sc.nextInt();
        }
        System.out.println("YOUR ARRAY IS:  ");
        for (i = 0; i < k; i++) {

            System.out.print(" " + a[i]);
        }
        System.out.println("  ");
        c = a[0];
        a[0] = a[k - 1];
        a[k - 1] = c;
        System.out.println(" Swapped Array: ");
        for (i = 0; i < k; i++) {

            System.out.print(" " + a[i]);
        }

    }
}
