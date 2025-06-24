import java.util.*;
class sum
{
    public static void triplets(int[] arr,int sum)
    {
        Arrays.sort(arr);
       int  currentsum=0;
        for(int i=0;i<arr.length-2;i++)
        {
            int left=i+1;
            int right=arr.length-1;
            while(left<right)
            {
                currentsum=arr[i]+arr[left]+arr[right];
                if(currentsum==sum)
                {
                    System.out.print(arr[i]+" "+arr[left]+" "+arr[right]);
                    System.out.println();
                    left++;
                    right--;
                }
                else if(currentsum<sum)
                {
                    left++;
                }
                else
                right--;

            }
        }
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7,8};
        int sum=15;
        triplets(arr,sum);
    }
}