import java.util.Scanner;

public class StringConcantate {
    public static void main(String args[]) {
        String str1, str2;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the 1st string");
        str1 = obj.nextLine();
        System.out.println("Enter the 2nd string");
        str2 = obj.nextLine();
        System.out.println("Concatenated String is ");
        System.out.println(str1.concat(str2));
    }
}