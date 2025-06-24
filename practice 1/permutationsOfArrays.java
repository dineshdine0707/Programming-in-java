import java.util.*;
public class permutationsOfArrays{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        boolean[] used=new boolean[5];
        permutate(arr,new ArrayList<>(),used);
    }
    public static void permutate(int[] arr,List<Integer> list,boolean[] used)
    {
        if(list.size()==arr.length)
        {
            System.out.println(list);
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!used[i])
            {
                list.add(arr[i]);
                used[i]=true;
                permutate(arr,list,used);
                list.remove(list.size()-1);
                used[i]=false;
            }
        }
    }
}
