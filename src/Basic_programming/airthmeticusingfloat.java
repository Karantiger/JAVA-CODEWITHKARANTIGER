package Basic_programming;
import java.util.Scanner;
public class airthmeticusingfloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two float value: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        float sum = num1+num2;
        float sub = num1-num2;
        float mul = num1*num2;
        float div = num1/num2;
        float mod = num1%num2;

        System.out.println("Addition of two number: " +sum);
        System.out.println("Subtraction of two number: " +sub);
        System.out.println("Multiplication of two number: " +mul);
        System.out.println("Division of two number: " +div);
        System.out.println("Modulus of two number: " +mod);
        sc.close();
    }
}
