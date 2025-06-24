import java.util.*;
class bst
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int val)
    {
        if(root==null)
        {
            root=new Node(val);
            return root;
        }
        if(root.data>val)
        {
            root.left=insert(root.left,val);
        }
        else if(root.data<val)
        {
            root.right=insert(root.right,val);
        } 
        return root;
    }
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==key)
        {
            return true;
        }
        if(root.data>key)
        {
          return search(root.left,key);
        }
        else
        {
            return search(root.right,key);
        }
    }
    public static Node delete (Node root,int val)
    {
        if(root.data>val)
        {
            root.left=delete(root.left,val);
        }
        else if(root.data<val)
        {
            root.right=delete(root.right,val);
        }
        else
        {
         if(root.left==null && root.right==null)
         {
            return null;
         }
         else if(root.left==null)
         {
            return root.right;
         }
         else if(root.right==null)
         {
            return root.left;
         }
         else
         {
          Node IS=inorderSuccessor(root.right);
          root.data=IS.data;
          root.right=delete(IS,IS.data);
         }
        }
        return root;
    }
    public static void printinRange(Node root,int k1,int k2)
    {
        if(root==null)
        {
            return;
        }
        if(root.data>=k1 && root.data<=k2)
        {
            printinRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printinRange(root.right,k1,k2);
        }
        else if(root.data>k2)
        {
            printinRange(root.left,k1,k2);
        }
        else
        printinRange(root.right,k1,k2);
        {

        }
    }
    public static Node inorderSuccessor(Node root)
    {
        while(root.left==null)
        {
            root=root.left;
        }
        return root;
    }
    public static void printlist(ArrayList<Integer> path)
    {
        for(int i=0;i<path.size();i++)
        {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }
    public static void printpaths(Node root,ArrayList<Integer> path)
    {
        if(root==null)
        {
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null)
        {
            printlist(path);  
        }
        printpaths(root.left,path);
        printpaths(root.right,path);
        path.remove(path.size()-1);
    }
    public static boolean validBST(Node root,Node min,Node max)
    {
        if(root==null)
        {
            return true;
        }
        if(min!=null && root.data<=min.data)
        {
            return false;
        }
       else if(max!=null && root.data>=max.data)
        {
            return false;
        }
        return validBST(root.left,min,root) && validBST(root.right,root,max);
    }
    public static void main(String[] args)
    {
        int values[]={1,1,1};
        Node root=null;
        for(int i=0;i<values.length;i++)
        {
             root=insert(root,values[i]);
        }
}
}