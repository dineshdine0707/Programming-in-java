import java.util.*;
public class permutationsOfString {
    public static void main(String[] args) {
        String str="abcd";
        permutate(str,"");
    }
    public static void permutate(String str,String curr)
    {
        if(str.length()==0)
        {
            System.out.println(curr);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            permutate(str.substring(0,i)+str.substring(i+1),curr+str.charAt(i));
        }
    }
}
