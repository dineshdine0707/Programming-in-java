import java.util.*;
public class longestCommonSubsequence {
    public static void main(String[] args)
    {
        String s1 = "fisher";
        String s2="fisher";
        int[][] memo=new int[s1.length()+1][s2.length()+1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        System.out.println("Length of LCS of " + s1 + " and " + s2+" is "+lcs(s1,s2,0,0,memo));
    }
    public static int lcs(String s1,String s2,int i,int j,int[][] memo)
    {
        if(i==s1.length() || j==s2.length())
        {
            return 0;
        }
        if(memo[i][j]!=-1)
        return memo[i][j];
        if(s1.charAt(i)==s2.charAt(j))
        {
            memo[i][j]=1+lcs(s1,s2,i+1,j+1,memo);
            return memo[i][j];
        }
        else
        {
            memo[i][j]=Math.max(lcs(s1,s2,i,j+1,memo),lcs(s1,s2,i+1,j,memo));
            return memo[i][j];
        }
    }
}
