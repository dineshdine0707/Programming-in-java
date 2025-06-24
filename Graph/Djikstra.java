import java.util.*;
public class Djikstra {
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
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,1));
        graph[1].add(new Edge(1,3,3));
        graph[2].add(new Edge(2,3,3));
        graph[2].add(new Edge(2,5,7));
        graph[2].add(new Edge(2,4,2));
        graph[3].add(new Edge(3,5,6));
        graph[4].add(new Edge(4,5,1));
        DijkstraDist(graph,0);
    }
    static class Pair
    {
        int n,path;
        public Pair(int n,int Path)
        {
            this.n=n;
            this.path=path;
        }
    }
    public static void DijkstraDist(ArrayList<Edge>[] graph,int src)
    {
        int[] dist=new int[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(i!=src)
            {
                dist[i]=Integer.MAX_VALUE;
            }
        }
        boolean[] visited =new boolean[graph.length];
        LinkedList<Pair> pq=new LinkedList<>();
        pq.add(new Pair(src,0));
        while(!pq.isEmpty())
        {
            Pair curr=pq.poll();
            while(!visited[curr.n])
            {
                visited[curr.n]=true;
                for(int i=0;i<graph[curr.n].size();i++)
                {
                    Edge e=graph[curr.n].get(i);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;
                    if(dist[u]+wt<dist[v])
                    {
                        dist[v]=dist[u]+wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        for(int i=0;i<dist.length;i++)
        {
            System.out.print(dist[i]+" ");
        }

    }

}

