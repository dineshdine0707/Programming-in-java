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
class info
{
    Node node;
    int hd;
    public info(Node node,int hd)
    {
        this.node=node;
        this.hd=hd;
    }
}
public void topView(Node root)
{
    queue<Node,Integer> q=new Linkedlist<>();
    Hashmap<Integer,Node> map=new Hashmap<>();
    q.add(root,0);
    q.add(null,0);
    int min=0,max=0;
    while(!q.isEmpty())
    {
        q.remove(new Info(current));
        if( current == null)
        {
            if(q.isEmpty())
            {
                break;
            }
            else{
                q.add(null);
            }
        }
        else
        {
        if(!map.containskey(current.hd))
        {
            map.put(current.hd,current);
        }
        if(current.left!=null)
        {
            min=Math.min(min,current.hd-1);
            q.add(current.left,min);
        }
        if(current.right!=null)
        {
            max=Math.max(min,current.hd+1);
            q.add(current.left,max);
        }
        }
        for(int i=0;i<max;i++)
        {
            System.out.println(new info(node).data+" ");
        }
    }
}
public class sub {
    public boolean isIdentical(Node node,Node subnode)
    {
        if(node == null && subnode == null)
        {
            return true;
        }
        else if(node == null || subnode == null || node.data != subnode.data)
        {
            return false;
        }
        if(!isIdentical(node.left,subnode.left))
        {
            return false;
        }
        if(!isIdentical(node.right,subnode.right))
        {
            return false;
        }
        return true;

    }
    public boolean isSubroot(Node root,Node subroot)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data==subroot.data)
        {
            if(isIdentical(root,subroot))
            {
                return true;
            }
        }
        return isSubroot(root.left,subroot) || isSubroot(root.right,subroot);

    }
    public static void main(String [] args)
    {
        sub ob=new sub();
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);


        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);
        boolean fact=ob.isSubroot(root,subroot);
        System.out.println(fact);
        ob.topView(root);

    }

    
}
