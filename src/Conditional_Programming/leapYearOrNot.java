package Conditional_Programming;
/* WAP to check whether year is leap year or not  */
import java.util.Scanner;

public class leapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if (year%4==0){
            System.out.println(+year+" is leap year");
        }
        else {
            System.out.println(+year+" is not leap year");
        }
        sc.close();
    }
}
