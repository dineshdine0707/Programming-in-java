import java.util.*;
public class lexicographicalString {
    public static void main(String[] args) {
        int number=75;
        System.out.println(lexString(number));
    } 
    public static String lexString(int num)
    {
        StringBuilder sb=new StringBuilder();
        while(num>0)
        {
            num--;
            int rem=num%26;
            sb.append((char)(rem+'A'));
            num=num/26;
        }
        return sb.reverse().toString();
    }
}
