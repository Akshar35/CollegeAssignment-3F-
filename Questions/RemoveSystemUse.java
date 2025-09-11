package collegeJavaImp.Questions;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RemoveSystemUse {
    public static void main(String[] args) throws FileNotFoundException {

        PrintStream akshar = new PrintStream("C:\\Users\\aksha_ppl0jcp\\OneDrive\\Desktop\\college java\\collegeJavaImp\\temp.txt");
        akshar.println("hello hi");
    }
}

// default console to any specific txt
// System.setOut(new PrintStream("C:\Users\aksha_ppl0jcp\OneDrive\Desktop\programs\javacollege\temp.txt"));
