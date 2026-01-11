import java.util.Scanner;
import java.lang.Math;

public class Main 
{
        public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Radius Of Circle: ");
        double r = scan.nextDouble();

        double area = Math.PI * Math.pow(r, 2);
        double circumference = 2 * Math.PI * r;

        System.out.println("Area Of Circle: " + area);
        System.out.println("Circumference Of Circle: " + circumference);
    }
}
