import java.util.*;
public class subsetOfArrays
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        subsets(arr,0,new ArrayList<>());
    }
    public static void subsets(int[] arr,int idx,List<Integer> list)
    {
        if(idx==arr.length)
        {
            System.out.println(list);
            return;
        }
        list.add(arr[idx]);
        subsets(arr,idx+1,list);
        list.remove(list.size()-1);
        subsets(arr,idx+1,list);
    }
}
