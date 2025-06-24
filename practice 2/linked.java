 public class linked
{
    static class ListNode
    {
        int val;
        ListNode next;
        public ListNode(int val)
        {
            this.val=val;
            this.next=null;
        }
    }
    public static void print(ListNode head)
    {
         ListNode curr=head;
         while(curr!=null)
         {
            System.out.print(curr.val+"->");
            curr=curr.next;
         }
         System.out.print("null");
    }
    static ListNode head;
    public static ListNode add(int val)
    {
        ListNode newnode=new ListNode(val);
        if(head==null)
        {
            head=newnode;
            
        }
        else{
            ListNode temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;  
            }
            temp.next=newnode;
            temp=temp.next;

        }
        return head;
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode L1=null;
        ListNode L2=null;
        ListNode curr=head;
        while(curr!=null)
        {
            if(curr.val==left)
            {
                L1=curr;
            }
            if(curr.val==right)
            {
                L2=curr;
            }
            curr=curr.next;
        }
        ListNode temp=head;
        while(temp.next!=null)
        {
            if(temp.next.val==left)
            {
                temp.next=L2;
                L2.next=temp.next.next;
            }
            if(temp.next.val==right)
            {
                temp.next=L1;
                L1.next=temp.next.next;
            }
            temp=temp.next;
        }
        return head;        
    }
    public static void main(String[] args)
    {
         head=null;
        for(int i=1;i<=5;i++)
        {
            head=add(i);
        }
        print(head);
    }

}