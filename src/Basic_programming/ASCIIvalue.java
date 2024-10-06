package Basic_programming;
/* WAP to print ASCII value of a character */
import java.util.Scanner;

public class ASCIIvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        int num = ch;
        System.out.println("ASCII value of character: "+num);
    }
}
