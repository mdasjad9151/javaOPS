import java.util.Scanner;

class InsertArray {
    public static void main(String[] args) {
        int a[] = new int[10];
        int i;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 10; i++) {

            System.out.println("Enter number at " + i + " position");
            a[i] = sc.nextInt();
        }
        System.out.println("YOUR ARRAY IS: ");
        for (i = 0; i < 10; i++) {
            System.out.print(" " + a[i]);

        }

    }
}