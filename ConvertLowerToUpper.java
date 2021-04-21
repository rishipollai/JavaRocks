import java.util.*;
class One
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                int no=s.charAt(i)-'a'+'A';
                char ch=(char)no;
                System.out.print(ch);
            }
               
            else
               System.out.print(s.charAt(i));
        }
        // System.out.println("no of char is "+c);
    }
}
