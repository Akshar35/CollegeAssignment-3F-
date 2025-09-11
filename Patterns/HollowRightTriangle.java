package collegeJavaImp.Patterns;

import java.util.Scanner;

public class HollowRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Print star at the borders or on the first/last row
                if (j == 1 || j == i || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces for alignment
                }
            }
            System.out.println();
        }
    }
}

