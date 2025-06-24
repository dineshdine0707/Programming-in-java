import java.util.*;
public class rotateArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        int key=sc.nextInt();
        System.out.println(Arrays.toString(rotateArray(arr,key)));
    }
    public static int[] rotateArray(int[] arr,int key)
    {
        int[] newArr=new int[arr.length];
        int revIdx=arr.length-key;
        int idx=0;
        for(int i=revIdx;i<arr.length;i++)
        {
            newArr[idx++]=arr[i];
        }
        for(int i=0;i<revIdx;i++)
        {
            newArr[idx++]=arr[i];
        }
        return newArr;
    }
}
