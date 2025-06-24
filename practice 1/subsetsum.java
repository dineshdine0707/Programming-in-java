import java.util.*;
public class subsetsum {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int reqSum=8;
        subsetSum(arr,reqSum,0,new ArrayList<>());
    }
    public static void subsetSum(int[] arr,int reqSum,int idx, ArrayList<Integer> list)
    {
        if(reqSum==0)
        {
          System.out.println(new ArrayList<>(list));
          return;
        }
        if(idx>=arr.length || reqSum<0)
           return;
        list.add(arr[idx]);
        subsetSum(arr,reqSum-arr[idx],idx+1,list);
        list.remove(list.size()-1);
        subsetSum(arr,reqSum,idx+1,list);
    }
}
