import java.util.*;
public class mergeSort {
    public static void main(String[] args) {
        int[] arr={7,6,5,4,3,2,1,0};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        mergeSort(arr, 0, arr.length-1);
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            }
    }
    public static void mergeSort(int[] arr,int left,int right)
    {
        if(left>=right)
        {
            return;
        }
        int mid=(left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    public static void merge(int[] arr,int left,int mid,int right)
    {
        int[] temp=new int[right-left+1];
        int i=left,j=mid+1,k=0;
        while(i<=mid&&j<=right)
        {
            if(arr[i]<=arr[j])
            {
                temp[k++]=arr[i];
                i++; 
            }
            else
            {
                temp[k++]=arr[j]; 
                j++;
                }
        }
        while(i<=mid)
        {
            temp[k++]=arr[i];
            i++;
        }
        while(j<=right)
        {
            temp[k++]=arr[j];
            j++;
        }
        for(i=left;i<=right;i++)
        {
            arr[i]=temp[i-left];
        }
        }
}
