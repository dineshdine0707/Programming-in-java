import java.util.*;
public class pivotNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int pivot=i;
            if(((i-1)*(i))/2>((n*(n+1))/2-(i*(i+1))/2))
            {
                System.out.println("The pivot is:"+i);
                return;
            }
        }
    }
}
