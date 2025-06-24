public class backtrack
{
    public static void findsubsets(String str,String ans,int i)
    {
        if(i==str.length())
        {
            System.out.println(ans);
            return;
        }
        findsubsets(str,ans+str.charAt(i),i+1);
        System.out.println(ans);
        
    }
    public static void main(String[] args)
    {
        String str="abc";
        findsubsets(str,"",0);
    }
}