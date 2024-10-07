package Conditional_Programming;
/* WAP to check whether is positive, negative and zero */
import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Value of the number: " + num); // Changed this line

        if (num == 0) {
            System.out.println(num + " is zero");
        } else if (num > 0) {
            System.out.println(num + " is positive");
        } else {
            System.out.println(num + " is negative"); // Removed the separate condition for negative
        }
        sc.close();
    }
}
