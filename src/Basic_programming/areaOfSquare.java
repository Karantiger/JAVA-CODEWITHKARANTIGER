package Basic_programming;

import java.util.Scanner;

public class areaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side: ");
        int side = sc.nextInt();
        int square = side*side;

        System.out.println("Area of Square: "+square);
    }
}
