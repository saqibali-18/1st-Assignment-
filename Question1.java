import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        float obt, total, per;

        obt = sc.nextFloat();
        total = sc.nextFloat();

        per = (obt / total) * 100;
        System.out.println(per);
    }
}
