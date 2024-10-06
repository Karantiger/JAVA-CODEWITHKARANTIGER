package Basic_programming;
import java.util.Scanner;

/* WAP to convert feet to meter */
public class feetToMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the feet: ");
        float num = sc.nextFloat();

        float meter = (float)(num / 3.2808399);
        System.out.println("Meter: "+meter);
    }
}
