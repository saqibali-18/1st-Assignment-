import java.util.Scanner;

public class Main 
{
        public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Original Selling Price: ");
        double price = scan.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discount = scan.nextDouble();

        double discountedPrice = price - (price * discount / 100);

        System.out.println("Discounted Selling Price: " + discountedPrice);
    }
}
