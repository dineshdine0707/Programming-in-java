import java.util.*;
public class NvalidParanthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an even number:");
        int n=sc.nextInt();
        if(n%2!=0)
        System.out.println("Enter even number only");
        nValidParenthesis(n,"",0,0);
    }
    public static void nValidParenthesis(int n, String s,int left,int right) {
        if(left>n/2 || right>left)
        return;
        if(s.length()==n)
        {
            System.out.println(s);
            return;
        }
        nValidParenthesis(n,s+"(",left+1,right);
        nValidParenthesis(n,s+")",left,right+1);
    }
}
