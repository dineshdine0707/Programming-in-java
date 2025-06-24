import java.util.*;
class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        List<String> list=new ArrayList<>();
        printLetters(str,"",list);
        System.out.println(list);
    }
    public static void  printLetters(String str,String curr,List<String> list)
    {
        if(str.length()==0)
        {
            list.add(curr);
            return;
        }
        String oneChar=equivalent(str.substring(0,1));
        if(oneChar != null)
        {
            printLetters(str.substring(1),curr+oneChar,list);
        }
        if(str.length()>1)
        {
        String twoChar=equivalent(str.substring(0,2));
        if(twoChar != null)
        {
            printLetters(str.substring(2),curr+twoChar,list);
        }
        }
    }
    public static String equivalent(String str)
    {
       int num=Integer.parseInt(str);
       if(num>26 || num<=0)
       return null;
       String[] alphabet={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
       return  alphabet[num-1];
    }
}