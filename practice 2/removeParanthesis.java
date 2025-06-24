import java.util.*;
class removeParanthesis{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result=removeParanthesis(str);
        System.out.println(result);
    }
    public static String removeParanthesis(String str)
    {
        StringBuilder sb=new StringBuilder();
        int open=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(')
            {
                open++;
                sb.append(ch);
            }
            else if(ch==')')
            {
                if(open>0)
                {
                    open--;
                    sb.append(ch);
                }
            }
            else
            sb.append(ch);
        }
        int close=0;
        StringBuilder result=new StringBuilder();
        for(int i=sb.length()-1;i>=0;i--)
        {
            char ch=sb.charAt(i);
            if(ch==')')
            {
                close++;
                result.append(ch);
            }
            else if(ch=='(')
            {
                if(close>0)
                {
                    close--;
                    result.append(ch);
                }
            }
            else
            result.append(ch);
        }
        return result.reverse().toString();
    }
}