package Conditional_Programming;
/* WAP to print day of week name using else if ladder statement */
import java.util.Scanner;

public class weekUsingElseIfLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number (1 to 7): ");
        int day = sc.nextInt();

        System.out.println("1. Sunday");
        System.out.println("2. Monday");
        System.out.println("3. Tuesday");
        System.out.println("4. Wednesday");
        System.out.println("5. Thursday");
        System.out.println("6. Friday");
        System.out.println("7. Saturday");

        System.out.println("Enter the choice: ");
        int ch = sc.nextInt();

        if (ch==1){
            System.out.println("Sunday");
        } else if (ch==2) {
            System.out.println("Monday");
        } else if (ch==3) {
            System.out.println("Tuesday");
        } else if (ch==4) {
            System.out.println("Wednesday");
        } else if (ch==5) {
            System.out.println("Thursday");
        } else if (ch==6) {
            System.out.println("Friday");
        } else if (ch==7) {
            System.out.println("Saturday");
        }else {
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
