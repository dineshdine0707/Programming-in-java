import java.util.*;
public class Prims {
    static class Edge
    {
        int src,dest,wt;
        public Edge(int src,int dest,int wt)
        {
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void main(String[] args)
    {
        ArrayList<Edge>[] graph=new ArrayList[6];
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        createGraph(graph);
        System.out.println(prims(graph));
    }
    public static void createGraph(ArrayList<Edge>[] graph)
    {
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,1));
        graph[1].add(new Edge(1,0,2));
        graph[1].add(new Edge(1,3,3));
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,3,3));
        graph[2].add(new Edge(2,4,2));
        graph[2].add(new Edge(2,5,7));
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,3));
        graph[3].add(new Edge(3,5,6));
        graph[4].add(new Edge(4,2,2));
        graph[4].add(new Edge(4,5,1));
        graph[5].add(new Edge(5,2,7));
        graph[5].add(new Edge(5,3,6));
        graph[5].add(new Edge(5,4,1));
    }
    public static int prims(ArrayList<Edge>[] graph)
    {
        boolean[] visited=new boolean[graph.length];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);  
        pq.add(new int[]{0,0});
        int totalMinCost=0;
        while(!pq.isEmpty())
        {
            int[] arr=pq.poll();
            int vtx=arr[0];
            int cost=arr[1];
            if(!visited[vtx])
            {
                visited[vtx]=true;
                totalMinCost+=cost;
                for(int i=0;i<graph[vtx].size();i++)
                {
                    Edge e=graph[vtx].get(i);
                    int dest=e.dest;
                    int weight=e.wt;
                    pq.offer(new int[]{dest,weight});
                }
            }
        }
        return totalMinCost;
    }
}
