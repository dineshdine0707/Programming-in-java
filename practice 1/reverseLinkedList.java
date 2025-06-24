import java.util.*;
public class reverseLinkedList {
    public static class Node
    {
        int x;
        Node next;
        public  Node(int x)
        {
            this.x=x;
            this.next=null;
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7};
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++)
        {
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }
        printList(head);
        Node reversedHead=reverse(head);
        printList(reversedHead);
    }
    public static void printList(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {    if(curr.next==null)
            {
                System.out.print(curr.x);
            }  
            else
            {  
            System.out.print(curr.x+"->");
            }
            curr=curr.next;
        }
        System.out.println();
    }
    public static Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        while(curr!=null)
        {
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
}
