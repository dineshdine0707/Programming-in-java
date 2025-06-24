import java.util.ArrayList;
import java.util.List;

public class FindMissingObservations {
    public static List<List<Integer>> ans=new ArrayList<>();
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int sum=0;
        for(int num:rolls)
            sum+=num;
        int target=(mean*(n+rolls.length))-sum;
        List<Integer> list=new ArrayList<>();
        backtrack(0,target,list,n);
        if(ans.size()==0)
            return new int[0];
        int[] sol=new int[ans.get(0).size()];
        for(int i=0;i<ans.get(0).size();i++)
            sol[i]=ans.get(0).get(i);
        return sol;
    }
    public static void backtrack(int currSum,int target,List<Integer> list,int n)
    {
        if(currSum>target || list.size()>n)
            return;
        if(currSum==target && list.size()==n)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=1;i<=6;i++)
                    {
                        list.add(i);
                        backtrack(currSum+i,target,list,n);
                        list.remove(list.size()-1);
                    }
                    
            
    }
    public static void main(String[] args)
    {
        int[] rolls={1,5,6};
        int[] ans=missingRolls(rolls,6,10);
        System.out.print("[");
        for(int num:ans)
        {
            System.out.print(num+" ");
        }
        System.out.print("]");
    }
    
}
