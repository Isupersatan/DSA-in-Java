import java.util.Scanner;

public class Q4_circle {
    public static double circleArea(double r) {
        double diameter = r*2;
        double circum = Math.PI*diameter;
        return circum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double r = sc.nextDouble();

        System.out.print("The circumference of the circle is: "+circleArea(r));

        sc.close();
    }
}
