class Solution {
    public ListNode rotateRight(ListNode head, int k) {
if(head==null || k==0)return head;

        int len=1;
        ListNode tail=head;
        while(tail.next!=null)
        {   len++;
            tail=tail.next;
        }
        tail.next=head;

        k=k%len;
        int stepsToTail=len-k;
       ListNode newTail=head;
        for(int i=1;i<stepsToTail;i++)
        {
            newTail=newTail.next;
        }
        ListNode newHead=newTail.next;
        newTail.next=null;

        return newHead;
    }
}