import java.util.*;
public class findWord {
    public static void main(String[] args)
    {
        String word="hab";
        char[][] matrix={{'h','a','t'},{'a','b','c'},{'d','e','f'}};
        boolean found=false;
        boolean visited[][]=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==word.charAt(0))
                {
                    found=backtrack(matrix,i,j,0,word,visited);
                    if(found)
                    {
                        System.out.println("The word exists");
                        return;
                    }
                }
            }
        }
        System.out.println("The word doesn't exists");
        return;
    }
    public static boolean backtrack(char[][] matrix,int i,int j,int idx,String word,boolean[][] visited)
    {
        if(i<0 || i>=matrix.length || j<0 || j>=matrix[0].length || matrix[i][j]!=word.charAt(idx)|| visited[i][j])
        {
            return false;
        }
        if(idx==word.length()-1)
        {
            return true;
        }
        visited[i][j]=true;
        boolean up=backtrack(matrix,i-1,j,idx+1,word,visited);
        boolean down=backtrack(matrix,i+1,j,idx+1,word,visited);
        boolean left=backtrack(matrix,i,j-1,idx+1,word,visited);
        boolean right=backtrack(matrix,i,j+1,idx+1,word,visited);
        visited[i][j]=false;
        return up||down||left||right;
    }
}
