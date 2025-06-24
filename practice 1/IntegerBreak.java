import java.util.*;
public class IntegerBreak {
    public static int maxProduct=1;
    public static int integerBreak(int n) {
        maxProduct=1;
        backtrack(0,n,new ArrayList<>());
        return maxProduct;
    }
    public static void backtrack(int currSum,int target,List<Integer> list)
    {
        if(currSum>target)
        {
            return;
        }
        if(currSum==target)
        {
            maxProduct=Math.max(maxProduct,product(list));
            return;
        }
        for(int i=1;i<target;i++)
        {
            list.add(i);
            backtrack(currSum+i,target,list);
            list.remove(list.size()-1);
        }
    }
    public static int product(List<Integer> list)
    {
        int tempProduct=1;
        for(int num:list)
        {
            tempProduct*=num;
        }
        return tempProduct;
    }
    public static void main(String[] args)
    {
        System.out.println(integerBreak(26));
    }
}
