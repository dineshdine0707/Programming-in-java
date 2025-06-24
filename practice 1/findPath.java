import java.util.*;
public class findPath {
   public static void main(String[] args) {
    int[][] path={{1,1,0,1},{0,1,0,0},{0,1,0,0},{0,1,1,1}};
    boolean[] pathExists={false};
    backtrack(path,0,0,pathExists);
    System.out.println(pathExists[0]);
   } 
   public static void backtrack(int[][] path,int i,int j,boolean[] pathExists)
   {
    if(i<0 || i>=path.length || j<0 || j>=path[0].length || path[i][j]==0)
    {
        return;
    }
    if(i==path.length-1 && j==path[0].length-1)
    {
        pathExists[0]=true;
    }
    int temp=path[i][j];
    path[i][j]=0;
    backtrack(path,i,j+1,pathExists);
    backtrack(path,i+1,j,pathExists);
    path[i][j]=temp;
   }
}
