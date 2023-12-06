import java.util.Scanner;

class circle {
    public static void main(String[] args) {
        double radius, per, area;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the radiuss of circle: ");
        radius = obj.nextFloat();
        per = 2 * 3.14 * radius;

        System.out.println("perimeter of circle is : " + per);
        area = 3.14 * radius * radius;

        System.out.println("area of circle is : " + area);
    }
}
