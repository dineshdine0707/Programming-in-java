import java.util.*;
import java.util.Math;
public class sublistSum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10000];
        for(int i=0;i<10000;i++)
        {
            arr[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        for(int idx=0;idx<n;idx++)
        {
            int i=sc.nextInt();
            int j=sc.nextInt();
            int sum=0;
            for(int k=i;k<=j;k++)
            {
                sum=sum+arr[k];
            }
            System.out.println(sum);
        }
    }
    
}
