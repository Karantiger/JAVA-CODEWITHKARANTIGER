package Basic_programming;
/*  WAP to enter two integer number and perform airthmetic operation without 3rd variable also using int datatype */
import java.util.Scanner;

public class airthmeticoperationwith3rdvariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer value: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1+num2;
        int sub = num1-num2;
        int mul = num1*num2;
        int div = num1/num2;
        int mod = num1%num2;

        System.out.println("Addition of two number: " +sum);
        System.out.println("Subtraction of two number: " +sub);
        System.out.println("Multiplication of two number: " +mul);
        System.out.println("Division of two number: " +div);
        System.out.println("Modulus of two number: " +mod);
        sc.close();

    }
}
