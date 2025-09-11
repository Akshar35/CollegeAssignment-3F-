package collegeJavaImp.Questions;

public class VowelsConsonent {
    public static void main(String[] args) {
        String s="This is my game ";
        int c=0;
        int v=0;
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)+"").equalsIgnoreCase("a")||
                    (s.charAt(i)+"").equalsIgnoreCase("e") ||
                    (s.charAt(i)+"").equalsIgnoreCase("i")||
                    (s.charAt(i)+"").equalsIgnoreCase("o") ||
                    (s.charAt(i)+"").equalsIgnoreCase("u"))
            {
                v=v+1;
            }
            else if(s.charAt(i)!=' ')
            {
                c=c+1;
            }
        }
        System.out.println("vowels are "+v);
        System.out.println("consonents are "+c);
    }

}

