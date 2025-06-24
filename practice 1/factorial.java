import java.util.*;
public class factorial {
    public static int factorial(int n)
    {
        if(n==0)
        return 1;
        else
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int res=factorial(n);
    System.out.println(res);
    }
}

