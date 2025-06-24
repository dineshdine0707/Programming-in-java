import java.util.*;
public class removeDuplicatesInaLinkedList {
    static class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
            this.next = null;
    }
}
public static Node buildList(int[] arr)
{
    Node head=new Node(arr[0]);
    Node current=head;
    for(int i=1;i<arr.length;i++)
    {
        Node newNode=new Node(arr[i]);
        current.next=newNode;
        current=newNode;
    }
    return head;
}
public static void printList(Node head)
{
    Node curr=head;
    while(curr!=null)
    {
        if(curr.next==null)
        System.out.print(curr.val);
        else
        System.out.print(curr.val+"->");
        curr=curr.next;
    }
    System.out.println();
}
public static Node removeDuplicates(Node head,List<Integer> out)
{
    Node dummy=new Node(0);
    dummy.next=head;
    Node prev=dummy;
    Node curr=head;
    while(curr!=null)
    {
        if(out.contains(curr.val))
        {
            prev.next=curr.next;
        }
        else
        {
            prev=curr;
        }
        curr=curr.next;
    }
    return dummy.next;
}
    public static void main(String[] args)
    {
        int[] arr={1,1,2,3,4,4,5,5,6,7};
        Node head=buildList(arr);
        printList(head);
        List<Integer> in=new ArrayList<>();
        List<Integer> out=new ArrayList<>();
        for(int num:arr)
        {
            if(!in.contains(num))
            in.add(num);
            else
            out.add(num);
        }
        head=removeDuplicates(head,out);
        printList(head);
    }
}
