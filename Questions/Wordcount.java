package collegeJavaImp.Questions;

public class Wordcount
{
    public static void main(String args[])
    {
        String s="This is my game       ";
        s=s.trim();  //to remove extra spaces from last and start
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== ' '  && s.charAt(i+1)!= ' ')
            {
                c=c+1;
            }
        }System.out.println("total number of words are "+c);
    }
}
