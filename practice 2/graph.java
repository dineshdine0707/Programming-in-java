import java.util.*;
class graph
{
    static class edge
    {
        int src,dest,wt;
        public edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void bfs(ArrayList<edge>[] graph)
    {
        Queue<Integer> q=new LinkedList();
        boolean vis[]=new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty())
        {
            int curr=q.remove();
            if(!vis[curr])
            {
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++)
                {
                    edge e=graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }
    }
    public static void dfs(ArrayList<edge>[] graph,int curr,boolean[] vis)
    {
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            edge e=graph[curr].get(i);
            if(!vis[e.dest])
            {
                dfs(graph,e.dest,vis);
            }
        }
    }
    public static boolean hasPath(ArrayList<edge>[] graph,int src,int dest,boolean[] vis)
    {
        if(src==dest)
        {
            return true;
        }
        vis[src]=true;
        for(int i=0;i<graph[src].size();i++)
        {
            edge e=graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph,e.dest,dest,vis))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int V=5;
        ArrayList<edge>[] graph=new ArrayList[V];
        for(int i=0;i<V;i++)
        {
            graph[i]=new ArrayList<>();
        } 
        graph[0].add(new edge(0,1,1));

        graph[1].add(new edge(1,0,1));
        graph[1].add(new edge(1,2,2));
        graph[1].add(new edge(1,3,3));

        graph[2].add(new edge(2,1,2));
        graph[2].add(new edge(2,3,4));

        graph[3].add(new edge(3,1,3));
        graph[3].add(new edge(3,2,4));
        graph[3].add(new edge(3,4,5));

        graph[4].add(new edge(4,3,5));
    
        bfs(graph);
        System.out.println();
        dfs(graph,0,new boolean[V]);
        System.out.println();
        boolean bool=hasPath(graph,0,5,new boolean[V]);
        System.out.println(bool);
    }
}