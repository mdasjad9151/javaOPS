import java.util.Scanner;

public class newq {
    public static void main(String args[]) {
        /* Initialize array */
        int[] arr;

        int n = 0, i = 0, j = 0;
        boolean flag = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter numbers in array:");
        for (i = 0; i < n; i++) {
            System.out.print((i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements Entered in given array:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("prime Elements in an array:");
        for (i = 0; i < n; i++) {

            flag = true;
            if (arr[i] > 1) {
                for (j = 2; j < arr[i]; j++) {
                    /* Checking if number is divisible by j. */
                    if (arr[i] % j == 0) {

                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    System.out.print(arr[i] + " ");
                }
            }
        }

    }
}