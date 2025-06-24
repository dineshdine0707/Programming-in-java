import java.util.*;
class main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n+i;j++)
            {
                System.out.print(j%(n)+1+"");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        int num=1;
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=6-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(num);
                num=num+2;
            }
            if(num<=3)
            num=num-1;
            else
            num=num-3;
            System.out.println();
        }
    }
}
