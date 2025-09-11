package collegeJavaImp.Questions;

public class LengthOfNumber {
    public static void main(String[] args) {
        int n=1234;
        int s=0;
        while(n!=0){
            n=n/10;
            s=s+1;
        }
        System.out.println(s);
    }
}
