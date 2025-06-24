import java.util.*;
public class selectionSort {
    public static void main(String[] args) {
        int[] arr={5,8,2,9,1,-1};
        selectionSort(arr);
        for(int num:arr)
        System.out.print(num+" ");
    }
    public static void selectionSort(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int min=Integer.MAX_VALUE;
            int minIdx=-1;
            for(int j=i;j<n;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    minIdx=j;
                }
            }
            int temp=arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=temp;
        }
    }
}
