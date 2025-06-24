import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.println("Fibonacci Series upto n terms:");
        System.out.print(a+" 6");
        System.out.print(b+" ");
        for(int i=0;i<n-2;i++)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
