package collegeJavaImp.Patterns;

import java.util.Scanner;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {         // Loop through rows
            for (int j = 1; j <= i; j++) {     // Print stars equal to row number
                System.out.print("* ");
            }
            System.out.println();              // Move to next line
        }
    }
}

