package Conditional_Programming;
/*WAP to check whether given number is even or odd*/
import java.util.Scanner;

public class inputIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println(+num+ " is even");
        }
        else{
            System.out.println(+num+ " is odd");
        }
    }
}
