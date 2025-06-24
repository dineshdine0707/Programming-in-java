import java.util.*;
class Solution {
    public static List<List<Integer>> list=new ArrayList<>();
    public static void main(String[] args)
    {
        int[] nums={1,0,-1,0,2,-2};
        foursum(nums,0);
        for(List<Integer> temp:list)
        {
            System.out.println(temp);
        }
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length-1;i++)
        {
            List<Integer> list=new ArrayList<>();
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int mid=j+(k-j)/2;
                int sum=nums[i]+nums[j]+nums[k]+nums[mid];
                if(sum==target)
                {
                    list.add(nums[i]);
                    list.add(nums[j]); 
                    list.add(nums[k]);
                    list.add(nums[mid]);
                }
                else if(sum<target)
                    j++;
                else
                    k--;
            }
            if(list.size()!=0)
                set.add(list);
        }
        List<List<Integer>> result=new ArrayList<>(set);
        return result;
    }
}