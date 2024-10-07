package Conditional_Programming;
/* WAP to perform airthmetic operation with using else if ladder statement */
import java.util.Scanner;

public class airthmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        System.out.println("Enter a choice: ");
        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.println("Addition of two number: "+(num1 + num2));
        } else if (ch == 2) {
            System.out.println("Subtraction of two number: "+(num1 - num2));
        } else if (ch == 3) {
            System.out.println("Multiplication of two number: "+(num1 * num2));
        } else if (ch == 4) {
            System.out.println("Division of two number: "+(num1 / num2));
        } else if (ch == 5) {
            System.out.println("Modulus of two number: "+(num1 % num2));
        }else{
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}













