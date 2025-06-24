import java.util.*;
public class subsetsOfString {
    public static void main(String args[])
    {
        String str="abc";
        subsets(str,0,"");
    }
    public static void subsets(String str,int idx,String curr)
    {
        if(idx==str.length())
        {
            if(curr.equals(""))
            System.out.println("null");
            else
            System.out.println(curr);
            return;
        }
        subsets(str,idx+1,curr+str.charAt(idx));
        subsets(str,idx+1,curr);
    }
}
