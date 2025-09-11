package collegeJavaImp.Questions;

import java.util.Scanner;
public class ExtractWhiteSpace
{
    public static void main(String[] args) {
        String ab ="";
        Scanner sc= new Scanner(" this is my class   guys     ");

        while(sc.hasNext())
        {
            ab=ab+sc.next();
        }
        System.out.println("String without spaces are "+ab);
    }
}
