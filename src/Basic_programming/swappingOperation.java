package Basic_programming;
/*  Swapping operation using third variable   */
import java.util.Scanner;

public class swappingOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, temp;
        System.out.println("Enter two values: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        // Swapping operation using third variable
            temp = num1 + num2;
            num1 = temp - num1;
            num2 = temp - num2;

//        Swapping operation without using third variable
//        num1 = num1+num2;
//        num2 = num1-num2;
//        num1 = num1-num2;

        System.out.println("First number: "+num1);
        System.out.println("Second number: "+num2);
    }
}
