package Basic_programming;
/*  WAP to enter two integer number and perform airthmetic operation without 3rd variable also using int datatype */
import java.util.Scanner;

public class airthmeticoperationwithout3rdvariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer value: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Addition of two number: " +(num1+num2));
        System.out.println("Subtraction of two number: " +(num1-num2));
        System.out.println("Multiplication of two number: " +(num1*num2));
        System.out.println("Division of two number: " +(num1/num2));
        System.out.println("Modulus of two number: " +(num1%num2));
        sc.close();

    }
}
