import java.util.*;
public class Creation {
    static class Edge
    {
        int src,dest,wt;
        public Edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void main(String[] args)
    {
        int v=6;
        ArrayList<Edge>[] graph= new ArrayList[v];
        for(int i=0;i<v;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,3,1));
        graph[0].add(new Edge(0,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[3].add(new Edge(3,1,3));
        graph[4].add(new Edge(4,1,1));
        graph[4].add(new Edge(4,0,2));
        graph[5].add(new Edge(5,0,1));
        graph[5].add(new Edge(5,2 ,1));
        printPaths(graph,5,1,""+5);
        // For retrieving neighbours of all vertices
        
    }
    public static void printPaths(ArrayList<Edge>[] graph,int src,int dest,String path)
    {
        if(src==dest)
        {
            System.out.println(path);
            return;
        }
        if(!path.equals(""))
        {
            path=path+"->";
        }
        for(int i=0;i<graph[src].size();i++)
        {
            Edge e=graph[src].get(i);
            printPaths(graph,e.dest,dest,path+e.dest);
        }
    }
    public static void calcInDegree(ArrayList<Edge>[] graph,int[] inDegree)
    {
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e=graph[i].get(j);
                inDegree[e.dest]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge>[] graph)
    {
        int[] inDegree=new int[graph.length];
        calcInDegree(graph,inDegree);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<inDegree.length;i++)
        {
            if(inDegree[i]==0)
            {
                q.offer(i);
            }
        }
        while(!q.isEmpty())
        {
            int curr=q.remove();
            System.out.print(curr+" ");
            for(int i=0;i<graph[curr].size();i++)
            {
                Edge e=graph[curr].get(i);
                inDegree[e.dest]--;
                if(inDegree[e.dest]==0)
                {
                    q.add(e.dest);
                }
            }
        }
    }
    public static boolean hasPath(ArrayList<Edge>[] graph,int curr,int dest,boolean[] visited)
    {
        if(curr==dest)
        {
            return true;
        }
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(!visited[e.dest] && hasPath(graph,e.dest,dest,visited))
            {
                return true;
            }
        }
        return false;
    }
    public static void bfs(ArrayList<Edge>[] graph,int src)
    {
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[graph.length];
        q.add(src);
        while(!q.isEmpty())
        {
            int curr=q.remove();
            if(!visited[curr])
            {
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++)
                {
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean[] visited)
    {
        System.out.print(curr+" ");
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(!visited[e.dest])
            {
                dfs(graph,e.dest,visited);
            }
        }
    }
}
