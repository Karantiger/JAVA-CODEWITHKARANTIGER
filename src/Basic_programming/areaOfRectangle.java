package Basic_programming;

import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        int area = l*b;

        System.out.println("Area of Rectangle: "+area);
    }
}
