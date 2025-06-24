import java.util.*;
public class DFSTraversal {
    public static void printGraph(int[][] graph)
    {
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].length;j++)
            {
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void paintAdjacent(int[][] graph,int i,int j)
    {
        if(i<0 || i>=graph.length || j<0 ||j>=graph[i].length || graph[i][j]!=1)
        {
            return;
        }
        graph[i][j]=2;
        paintAdjacent(graph,i-1,j);
        paintAdjacent(graph,i,j-1);
        paintAdjacent(graph,i+1,j);
        paintAdjacent(graph,i,j+1);
    }
    public static void main(String[] args)
    {
        int[][] graph={{1,1,0,1,1},{1,0,1,1,0},{0,1,1,0,0},{1,1,1,0,0},{1,1,0,1,1}};
        printGraph(graph);
        paintAdjacent(graph,3,2);
        System.out.println("---------");
        printGraph(graph);
    }
}
