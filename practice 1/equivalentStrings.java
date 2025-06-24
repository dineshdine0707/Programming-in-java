import java.util.*;
public class equivalentStrings {
    public static void main(String[] args) {
        String str1="kattin";
        String str2="kittan";
        System.out.println(equivalent(str1,str2));
    }
    public static boolean equivalent(String str1,String str2)
    {
        int count=0;
        int[] diff=new int[2];
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            {
                diff[count]=i;
                count++;
            }
            if(count>2)
            return false;
        }
        if(count!=2)
        return false;
        return str1.charAt(diff[0])==str2.charAt(diff[1]) && str1.charAt(diff[1])==str2.charAt(diff[0]);
}
}