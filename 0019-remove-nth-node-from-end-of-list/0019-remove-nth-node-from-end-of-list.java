class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
          if(n==size)
        {
            head=head.next;
            return head;
        }
       
        int i=1;
        ListNode prev=head;
        while(i<(size-n))
        {
          prev=prev.next;
          i++;
        }
        prev.next=prev.next.next;
        return head; 
    }
}