import java.util.*;
public class reverseBitNumber {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int n=sc.nextInt();
            int num=n;
            String reverse="";
            while(num>0)
            {
                if(num%2==0)
                    reverse+="0";
                else
                    reverse+="1";
                num=num/2;
            }
            int sum=0;
            for(int i=0;i<reverse.length();i++)
            {
                sum+=Math.pow(2,reverse.length()-1-i)*Integer.parseInt(String.valueOf(reverse.charAt(i)));
            }
            System.out.println(sum);
        }
}
