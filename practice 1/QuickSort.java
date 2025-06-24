import java.util.*;
public class QuickSort {
    public static void quickSort(int[] arr,int left,int right)
    {
        if(left>=right)
        return;
        int pivot=partition(arr,left,right);
        quickSort(arr,left,pivot-1);
        quickSort(arr,pivot+1,right);
    }
    public static int partition(int[] arr,int left,int right)
    {
        int piv=arr[right];
        int i=left-1;
        for(int j=left;j<=right;j++)
        {
            if(arr[j]<=piv)
            {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println();
        return i;
    }
    public static void printArr(int[] arr)
    {
        for(int num:arr)
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        printArr(arr);
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        printArr( arr);
    }
}
