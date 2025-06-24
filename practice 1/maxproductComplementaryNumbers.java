import java.util.*;
public class maxproductComplementaryNumbers {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4,5,6,7,8,9,10};
        int target=10;
        int[] result=new int[2];
        List<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(list.contains(target-nums[i]))
            {
                System.out.println("The possible elements are:"+"["+(target-nums[i])+","+nums[i]+"]");
                if(nums[i]*(target-nums[i])>max)
                {
                    max=nums[i]*(target-nums[i]);
                    result[0]=target-nums[i];
                    result[1]=nums[i];
                }
            }
            list.add(nums[i]);
        }
        System.out.println("The result with max product is "+Arrays.toString(result));
    }
}
