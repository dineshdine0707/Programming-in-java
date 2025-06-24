import java.util.*;
public class excelNumber {
    public static void main(String[] args) {
        String s="BA";
        System.out.println(excelNumber(s));
    }
    public static int excelNumber(String s)
    {
        int num=0;
        for(int i=0;i<s.length();i++)
        {
            int val=s.charAt(i)-'A';
            num=num*26+val+1;
        }
        return num;
    }
}
