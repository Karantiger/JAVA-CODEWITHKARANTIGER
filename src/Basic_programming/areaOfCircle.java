package Basic_programming;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        float radius = sc.nextFloat();
        float area = (float) (3.14*radius*radius);
        System.out.println("Area of circle: "+area);
    }
}
