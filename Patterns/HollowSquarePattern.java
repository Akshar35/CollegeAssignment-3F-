package collegeJavaImp.Patterns;

import java.util.Scanner;

public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {           // Loop through rows
            for (int j = 0; j < n; j++) {       // Loop through columns
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");     // Two spaces for alignment
                }
            }
            System.out.println();               // Move to next line
        }
    }
}

