import java.util.*;
public class longestIncreasingPath {
    public static void main(String[] args)
    {
        int[][] path={{9,9,4},{6,6,8},{2,1,1}};
        int min=1;
        for(int i=0;i<path.length;i++)
        {
            for(int j=0;j<path[0].length;j++)
            {
               min= Math.max(min,backtrack(path,i,j,0,-1));
            }
        }
        System.out.println(min);
    }
    public static int backtrack(int[][] path,int i,int j,int min,int prev)
    {
        if(i<0||i>=path.length||j<0||j>=path[0].length|| path[i][j]<=prev)
        {
            return min;
        }
        int up=backtrack(path,i-1,j, min+1, path[i][j]);
        int down=backtrack(path,i+1,j, min+1, path[i][j]);
        int left=backtrack(path,i,j-1, min+1, path[i][j]);
        int right=backtrack(path,i,j+1, min+1, path[i][j]);
        return Math.max(Math.max(up,down),Math.max(left,right));
    }
    }
