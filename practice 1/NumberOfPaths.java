public class NumberOfPaths {
    public static void main(String[] args)
    {
        int[][] paths={{0,0,0},{0,1,0},{0,0,0}};
        int numberOfPaths=backtrack(0,0,paths);
        System.out.println("There are "+numberOfPaths+ " paths");
    }
    public static int backtrack(int i,int j,int[][] paths)
    {
        if(i>=paths.length || j>=paths[0].length || paths[i][j]==1)
        {
            return 0;
        }
        if(i==paths.length-1 && j==paths[0].length-1)
        {
            return 1;
        }
        int right=backtrack(i,j+1,paths);
        int down=backtrack(i+1,j,paths);
        return right+down;
    }
}
