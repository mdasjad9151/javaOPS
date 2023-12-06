

import java.util.Scanner;

public class odd {
    public static void main(String args[]) {
        float a;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the first numberr");
        a = obj.nextInt();
        System.out.println("enter the second numberr");

        if (a % 2 == 0) {
            System.out.println("number is even");

        } else {
            System.out.println("number is oddd..");
        }
    }
}
