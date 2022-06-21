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

    public void main(String[] args){

    }
}