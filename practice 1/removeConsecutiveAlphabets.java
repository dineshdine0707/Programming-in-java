import java.util.*;
public class removeConsecutiveAlphabets {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result="";
        for(int i=1;i<str.length();i++)
        {
            if((Character.isLowerCase(str.charAt(i-1)) && Character.isUpperCase(str.charAt(i)) && str.charAt(i-1)==Character.toLowerCase(str.charAt(i)) || (Character.isLowerCase(str.charAt(i)) && Character.isUpperCase(str.charAt(i-1)) && str.charAt(i)==Character.toLowerCase(str.charAt(i-1)) )))
            continue;
            result+=str.charAt(i-1);
            if(i==str.length()-1)
            {
                result+=str.charAt(str.length()-1);
            }
        }
        System.out.println(result);
    }
}
