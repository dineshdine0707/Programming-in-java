import java.util.*;
class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class lowde
{
    int x=-1;
    public Node buildTree(int[] nodes)
    {
        x++;
     if(x>=nodes.length || nodes[x]==-1)
     {
        return null;
     }
     Node newnode=new Node(nodes[x]);
     newnode.left=buildTree(nodes);
     newnode.right=buildTree(nodes);
     return newnode;    
    }
    public void display(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        display(root.right);
        
    }
    public void levelDisplay(Node root)
    {
        if(root == null)
        {
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node current=q.remove();
            if(current==null)
            {
                System.err.println();
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
             System.out.print(current.data+" ");
             if(current.left!=null)
             {
             q.add(current.left);
             }
             if(current.right!=null)
             {
             q.add(current.right);
             }
            }

        }
    }
    public int height(Node root)
    {
     if(root == null)
     {
        return 0;
     }
     int lh=height(root.left);
     int rh=height(root.right);
     return Math.max(lh,rh)+1;
    }
    public int count(Node root)
    {
     if(root == null)
     {
        return 0;
     }
     int lh=count(root.left);
     int rh=count(root.right);
     return lh+rh+1;
    }
    public  int diameter(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        int lt=height(root.left);
        int rt=height(root.right);
        int self=lt+rt+1;
        return Math.max(self,Math.max(ld,rd));
    }


    public static void main(String[] args)
    {
        int[] nodes={1,2,4,-1,-1,3,-1,-1,5,6,-1,-1,7,-1,-1};
        lowde ob=new lowde();
       Node Root=ob.buildTree(nodes);
       ob.display(Root);
       System.out.println();
       ob.levelDisplay(Root);
       int k=ob.height(Root);
       System.out.println(k);
       int c=ob.count(Root);
       System.out.println(c);
       int d=ob.count(Root);
       System.out.println(d);
    }
}
