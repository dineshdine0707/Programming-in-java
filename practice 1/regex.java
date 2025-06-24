import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class regex {
  public static void main(String[] args)
  {
    List<String> list=new ArrayList<>();
    list.add("File_123");
    list.add("File_1");
    list.add("File_3a");
    list.add("File_124");
    Pattern pattern=Pattern.compile("^File_(\\d+)$");
    String ans=null;
    int max=Integer.MIN_VALUE;
    for(String str:list)
    {
        Matcher matcher=pattern.matcher(str);
        if(matcher.matches())
        {
            int num=Integer.parseInt(matcher.group(1));
            if(num>max)
            {
                max=num;
                ans=str;
            }
        }
    }
    if(ans!=null)
    {
        System.out.println(ans);
    }
    else
    System.out.println("No valid String exists");

  }  
}
