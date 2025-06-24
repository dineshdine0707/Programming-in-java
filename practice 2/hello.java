import java.util.*;
class hello
{
    public String addBinary(String a, String b) {
        int idx=0;
        StringBuilder str=new StringBuilder();
        int carry=0;
       while(idx<a.length() || idx<b.length())
       {
           int x=a.charAt(idx);
           int y=b.charAt(idx);

           if(x!=y)
           {
               str.append('1');
           }
           else
           if(x==0 && y==0)
           str.append('0');
           else
           {
               str.append('0'); 
               x=y;
           }
       }
       return str.toString();
        
    }
 public static void main(String[] args)
  {
   String a="101";
   String b="010";
   hello h=new hello();
   String s=h.addBinary(a,b);
   System.out.println(s);
   }
}