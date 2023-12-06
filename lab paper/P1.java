import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner num =  new Scanner(System.in);
        System.out.print("enter the number: ");

       double sum =  0;
       double n2 = 0;

        int n =  num.nextInt();
        for(int i =  1 ; i<=n; i++){
            n2 =  i;

            sum =  sum  + (1/n2);
        }
        System.out.println(sum);
        num.close();
    }
}
