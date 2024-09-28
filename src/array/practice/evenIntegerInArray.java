package array.practice;

import java.util.Scanner;

public class evenIntegerInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 array elements");
        int Arr[] = new int[5];
        for (int i = 0; i < Arr.length; i++)
            Arr[i] = sc.nextInt();
        System.out.println("Even Numbers: ");
        for (int j = 0; j < Arr.length; j++) {
            if (Arr[j] % 2 == 0) {
                System.out.println(Arr[j]);
            }

        }
    }
}
