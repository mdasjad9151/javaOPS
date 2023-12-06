import java.util.Scanner;
import java.lang.Math;

public class distanceFormula {
    public static void main(String args[]) {
        float x1, x2, y1, y2;  
        double distance;
        Scanner obj = new Scanner(System.in);
        System.out.print("ENTER THE x1: ");
        x1 = obj.nextFloat();
        System.out.print("ENTER THE x2: ");
        x2 = obj.nextFloat();
        System.out.print("ENTER THE y1: ");
        y1 = obj.nextFloat();
        System.out.print("ENTER THE y2: ");
        y2 = obj.nextFloat();
        distance = (Math.sqrt(Math.pow(x2 - x1, 2)) + Math.sqrt(Math.pow(y2 - y1, 2)));
        System.out.print("DISTYANCE BETWEEN TWO POINTS IS: " + distance);
    }

}
