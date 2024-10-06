package Basic_programming;
/*  WAP to enter weight in (float) and convert kg & gram  */
import java.util.Scanner;

public class convertwgtokg_g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight: ");
        float wg = sc.nextFloat();

        int kg= (int)wg;
        int g = (int)(wg - kg)*1000;

        System.out.println("Value of Kg: "+kg);
        System.out.println("Value of Gram: "+g);
        sc.close();
    }
}
