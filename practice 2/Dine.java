class Node
{
int data;
Node left;
Node right;
Node(int data)
{
this.data=data;
this.left=null;
this.right=null;
}}
class Dine
{
int index=-1;
public Node buildTree(int[] nodes)
{
index++;
if(index>=nodes.length || nodes[index]==-1)
{
return null;
}
else
{
Node newnode=new Node(nodes[index]);
if(newnode.data<=nodes[index])
{
newnode.left=buildTree(nodes);
}
else{
newnode.right=buildTree(nodes);
}
return newnode;
}
}
public static void main(String[] args)
{
int nodes[]={1,2,-1,3,-1,5,6,-1,7,8,9};
Dine root=new Dine();
Node Root=root.buildTree(nodes);
System.out.println(Root.data);
}

}