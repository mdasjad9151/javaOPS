import java.util.Scanner;

class PrimeArray {
    public static void main(String[] args) {
        int a[] = new int[10];
        int i, b = 0;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 10; i++) {

            System.out.println("Enter number at " + i + " position");
            a[i] = sc.nextInt();
        }
        System.out.println("YOUR ARRAY IS: ");
        for (i = 0; i < 10; i++) {
            System.out.print(" " + a[i]);

        }
        System.out.println(" ");
        for (int j = 2; j < a[i]; j++) {
            if (a[i] % j == 0) {
                System.out.println(a[i] + "is non prime");
                b = 1;

            }

        }
        if (b == 0) {
            System.out.println(a[i] + "is prime");
        }

    }
}
