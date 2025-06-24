import java.util.*;
public class floydsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp1=new ArrayList<>();
        temp1.add(1);
        list.add(temp1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            if(i==0)
            {
                System.out.print(temp1.get(0));
                System.out.println();
            }
            else
            {
                List<Integer> temp=list.get(list.size()-1);
                List<Integer> dummy=new ArrayList<>();
                dummy.add(1);
                for(int j=1;j<temp.size();j++)
                {
                    int sum=temp.get(j)+temp.get(j-1);
                    dummy.add(sum);
                }
                dummy.add(1);
                list.add(dummy);
                for(int k=0;k<dummy.size();k++)
                {
                    System.out.print(dummy.get(k)+" ");
                }
                System.out.println();
            }

        }
    }
    
}
