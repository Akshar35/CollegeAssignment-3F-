package collegeJavaImp.Patterns;

import java.util.Scanner;

public class SquareStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {         // Loop through rows
            for (int j = 0; j < n; j++) {     // Loop through columns
                System.out.print("* ");
            }
            System.out.println();             // Move to next line
        }
    }
}

