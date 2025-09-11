package collegeJavaImp.Patterns;

import java.util.Scanner;

public class MirroredRhombusStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print leading spaces (increasing with each row)
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars (fixed count per row)
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

