import java.util.Scanner;

public class Main 
{
        public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int n = scan.nextInt();

        if (n % 2 == 0) {
            System.out.println("EVEN");
        }
        else 
        {
            System.out.println("ODD");
        }
    }
}
