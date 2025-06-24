import java.util.*;
public class zeroesToEnd {
    public static int[] zeroesAtTheEnd(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
        for(int i=count;i<arr.length;i++)
        {
            arr[i]=0;
        }
        return arr;
    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
       System.out.println("Original Array:");
       System.out.println(Arrays.toString(arr));
       System.out.println("Array with zeroes at the end:");
       System.out.println(Arrays.toString(zeroesAtTheEnd(arr)));
    }
}
