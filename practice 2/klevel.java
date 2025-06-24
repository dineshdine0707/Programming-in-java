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
class klevel
{
    public void  klevel(Node root,int level,int k)
    {
        if(root == null)
        {
            return;
        }
        if(level==k)
        {
            System.out.print(root.data+" ");
            return;
        }
        klevel(root.left,level+1,3);
        klevel(root.right,level+1,3);
    }
    public void kLevel(Node root,int k)
    {
        if(root==null)
        {
            return;
        }
        int count=1;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            if (count == k) {
                // Print elements at kth level
                while (q.peek() != null) {
                    System.out.print(q.remove().data + " ");
                }
                return;

    }
             Node current=q.remove();
            if(current == null)
            {
                if(q.isEmpty())
                {
                    return;
                }
                else{
                    q.add(null);
                    count++;
                }
            }
            else
            {
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
public boolean getpath(Node root,int n,ArrayList<Node> path)
{
    if(root == null)
    {
        return false;
    }
    path.add(root);
    if (root.data== n)
    {
        return true;
    }   
    boolean leftpath=getpath(root.left,n,path);
    boolean rightpath=getpath(root.right,n,path);
    if(leftpath || rightpath)
    {
        return true;
    }
    path.remove(path.size()-1);
    return false;
}
public void lca(Node root,int n1,int n2)
{
    ArrayList<Node> path1=new ArrayList<>();
    ArrayList<Node> path2=new ArrayList<>();
    getpath(root,n1,path1);
    getpath(root,n2,path2);
    int i=0;
    while(i<path1.size() && i<path2.size())
    {
        if(path1.get(i)!=path2.get(i))
        {
            break;
        }
        i++;
    }
    Node lca=path1.get(i-1);
    System.out.println(lca.data);
}
public Node Lca1(Node root,int n1,int n2)
{
    if(root==null || root.data==n1 || root.data == n2)
    {
        return root;
    }
    Node leftnode=Lca1(root.left,n1,n2);
    Node rightnode=Lca1(root.right,n1,n2);
    if(leftnode == null)
    {
        return rightnode;
    }
    if(rightnode == null)
    {
        return leftnode;
    }
    return root;
}
public int lcaDist(Node root,int n)
{
    if(root==null)
    {
        return -1;
    }
    if(root.data==n)
    {
        return 0;
    }
    int l1=lcaDist(root.left,n);
    int l2=lcaDist(root.right,n);
    if(l1==-1 && l2==-1)
    {
        return -1;
    } 
    else if(l1==-1)
    {
        return l2+1;
    }
    else 
    {
    return l1+1;
    }
}
public int minDist(Node root,int n1,int n2)
{
    Node lca=Lca1(root,n1,n2);
    int dist1=lcaDist(lca,n1);
    int dist2=lcaDist(lca,n2);
    return dist1+dist2;
}
public int transform(Node root)
{
    if(root==null)
    {
        return 0;
    }
    int leftsum=transform(root.left);
    int rightsum=transform(root.right);
    int newlft=root.left==null?0:root.left.data;
    int newrgt=root.right==null?0:root.right.data;
    int data=root.data;
    root.data=newlft+leftsum+newrgt+rightsum;
    return data;
}
public void preorder(Node root)
{
    if (root==null) {
        return;   
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
}

    public static void main(String [] args)
    {
        klevel ob=new klevel();
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        ob.transform(root);
        ob.preorder(root);

    }
}