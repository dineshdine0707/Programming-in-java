import java.util.*;
public class NQueens {
    public static void printBoard(char[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<2*board.length-1;i++)
        {
            System.out.print("-"+"");
        }
        System.out.println();
    }
    public static boolean isSafe(char[][] board,int row,int col)
    {
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        return true;
    }
    public static int nQueens(char[][] board,int row)
    {
        if(row==board.length)
        {
            printBoard(board);
            return 1;
        }
        int count=0;
        for(int j=0;j<board[0].length;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j]='Q';
                count+=nQueens(board,row+1);
                board[row][j]='X';
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        char[][] board=new char[6][6];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                board[i][j]='X';
            }
        }
        System.out.println(nQueens(board,0));
    }
}
