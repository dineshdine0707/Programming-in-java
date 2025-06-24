import java.util.*;
public class NoOfClaps {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int NoOfTestCases=sc.nextInt();
        while(NoOfTestCases>0)
        {
            int n=sc.nextInt();
            System.out.println("No of claps:"+n*(n-1)/2);
            NoOfTestCases--;
        }
    }
}
