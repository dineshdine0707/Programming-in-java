import java.util.*;
public class coinChange {
    public static void main(String[] args)
    {
        int[] coins={2};
        int amount=3;
       int min= backtrack(coins,amount,0,Integer.MAX_VALUE);
       if(min==Integer.MAX_VALUE)
       System.out.println(-1);
       else
       System.out.println(min);
    }
    public static int backtrack(int[] coins,int target,int temp,int minimum)
    {
        if(target<0)
        return Integer.MAX_VALUE;
        if(target==0)
        {
           return temp;
        }
        for(int i=0;i<coins.length;i++)
        {
           minimum=Math.min(minimum,backtrack(coins,target-coins[i],temp+1,minimum));
        }
        return minimum;
    }
}
