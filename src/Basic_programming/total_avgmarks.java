package Basic_programming;
import java.util.Scanner;

/* WAP to enter three subjects marks & find the total and avg */
public class total_avgmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three subject marks: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int total = (num1+num2+num3);
        int avg = (num1+num2+num3)/3;

        System.out.println("Total marks: "+total);
        System.out.println("Average marks: "+avg);
        sc.close();
    }
}
