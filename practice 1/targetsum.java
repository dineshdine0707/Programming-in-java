import java.util.*;
public class targetsum {
    public static void main(String[] args) {
        int[] nums = {0 , 1, 2, 3, 4, 5,6,7};
        int target=7;
        List<List<Integer>> res=new ArrayList<>();
        targetSum(nums,0,0,target,new ArrayList<>(),res);
    }
    public static void targetSum(int[] nums,int idx,int total,int target,List<Integer> list,List<List<Integer>> res)
    {
        if(total>target || idx==nums.length)
        {
            return;
        }
        if(total==target)
        {
            if(!res.contains(list))
            {
            res.add(new ArrayList<>(list));
            System.out.println(list);
            }
            return;
        }
        list.add(nums[idx]);
        targetSum(nums,idx+1,total+nums[idx],target,list,res);
        list.remove(list.size()-1);
        targetSum(nums,idx+1,total,target,list,res);
    }
}
