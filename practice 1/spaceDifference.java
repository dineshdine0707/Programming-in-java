import java.util.*;
public class spaceDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(spaceDiffs(str1,str2));
}
public static String spaceDiffs(String str1,String str2)
{
    int s1=0;
    for(int i=0;i<str1.length();i++)
    {
        if(str1.charAt(i)==' ')
        s1++;
    }
    int s2=0;
    for(int i=0;i<str2.length();i++)
    {
        if(str2.charAt(i)==' ')
        s2++;
    }
    int diff=Math.abs(s1-s2);
    String result="";
    if(diff%2==0)
    result+="even"+diff;
    else
    result+="odd"+diff;
    return result;
}
}
