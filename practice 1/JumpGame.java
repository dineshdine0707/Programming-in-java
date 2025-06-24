public class JumpGame 
    {
        public static void main(String[] args)
        {
            int[] nums = {3,2,1,0,4};
            System.out.println(canJump(nums));
        }
        public static boolean canJump(int[] nums) {
            int reach=nums.length-1;
            for(int i=nums.length-2;i>=0;i--)
            {
                if(i+nums[i]>=reach)
                {
                    reach=i;
                } 
            }
            return reach==0;
    }
}
