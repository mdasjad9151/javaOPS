import java.util.Scanner;

public class EvenCountArray {
    public static void main(String[] args) {

        int i, k;
        int even = 0;
        int odd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemnts: ");
        k = sc.nextInt();
        int a[] = new int[k];

        for (i = 0; i < k; i++) {

            System.out.println("Enter number at " + i + " position");
            a[i] = sc.nextInt();
        }
        System.out.println("YOUR ARRAY IS: ");
        for (i = 0; i < k; i++) {
            System.out.print(" " + a[i]);
            if (a[i] % 2 == 0) {
                even = even + 1;

            } else {
                odd = odd + 1;
            }

        }
        System.out.println("  ");
        System.out.println(" EVEN COUNT: " + even);
        System.out.println(" ODD COUNT: " + odd);

    }
}
