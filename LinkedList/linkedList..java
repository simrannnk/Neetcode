public class linkedList{

    public ListNode reverseList(ListNode head){
         if(head==null || head.next==null)
         {
             return head;
         }
        ListNode curr=head;

        ListNode prev=null;
        while(curr!=null)
        {
            ListNode forw=curr.next;

            curr.next=prev;
            prev=curr;
            curr=forw;
        }

        return prev;
    }  

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode prev=dummy;

        ListNode curr1=l1;
        ListNode curr2=l2;

        while(curr1!=null && curr2!=null)
        {
            if(curr1.val<=curr2.val)
            {
                prev.next=curr1;
                prev=curr1;

                curr1=curr1.next;
            }

            else{
                prev.next=curr2;
                prev=curr2;
                curr2=curr2.next;
            }
        }

        if(curr1!=null)
        {
            prev.next=curr1;
        }

        else{
            prev.next=curr2;
        }

        return dummy.next;
    }

    public ListNode midNode(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }

        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public void reorderList(ListNode head) {

        if(head==null || head.next==null)
        {
            return;
        }
        ListNode mid=midNode(head);
        ListNode nHead=mid.next;
        nHead=reverseList(nHead);
        mid.next=null;

        ListNode curr1=head;
        ListNode curr2=nHead;

        while(curr1!=null && curr2!=null)
        {
            ListNode forw1=curr1.next;
            ListNode forw2=curr2.next;

            curr1.next=curr2;
            curr2.next=forw1;

            curr1=forw1;
            curr2=forw2;
        }


        
    }
    public void main(String[] args){

    }
}