package Conditional_Programming;
/* WAP to enter student marks and find percentage and grade */
import java.util.Scanner;

public class marks_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject's: ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        int total = (sub1 + sub2 + sub3 + sub4 + sub5);
        int percent = (total / 5);
        System.out.println("Percentage is: "+percent);

        if (percent>=80){
            System.out.println("Distinction");
        } else if (percent>=70) {
            System.out.println("First");
        } else if (percent>=60) {
            System.out.println("Second");
        } else if (percent>=50) {
            System.out.println("Third");
        } else if (percent>=40) {
            System.out.println("Fourth");
        }else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
