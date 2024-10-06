package Basic_programming;
import java.util.Scanner;
/* WAP to convert celsius to fahrenheit */
public class celsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp in celsius: ");
        float frn = sc.nextFloat();

        float Fahrenheit = (float) ((1.8*frn) + 32);
        System.out.println("Temperature in Fahrenheit: "+Fahrenheit);
    }
}
