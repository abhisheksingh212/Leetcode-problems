
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1=new ListNode(-1);
        ListNode dummy2=new ListNode(-2);

        ListNode odd=dummy1;
        ListNode even=dummy2;

        ListNode curr=head;
        int i=1;
        while(curr!=null)
        { ListNode next=curr.next;
            if(i%2!=0){
            curr.next=null;
            odd.next=curr;
            odd=odd.next;
            }
            else{   
                curr.next=null;
                even.next=curr;
                even=even.next;
            }
            i++;
            curr=next;
        }
odd.next=dummy2.next;
even.next=null;

return dummy1.next;
       /* ListNode result=null;
        ListNode lastConnected=null;

        if(dummy1.next!=null)
        {
            result=dummy1.next;
            lastConnected=odd;
        }
        if(dummy2.next!=null)
        {
            if(lastConnected!=null)
            {
                lastConnected.next=dummy2.next;
            }else
            {
                result=dummy2.next;
            }
            lastConnected=even;
        }

        if(lastConnected!=null)
        {
            lastConnected.next=null;
        }
        return result;
        */
    }
}