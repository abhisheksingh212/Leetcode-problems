
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
         while(curr!=null)
         {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
         return prev;
    }
    public ListNode removeNodes(ListNode head) {
    head=reverseList(head);
    if(head.next==null)
    {
        return head;
    }
    ListNode maxNode=head;
    ListNode currNode=head;

    while(currNode!=null && currNode.next!=null)
    {
        if(currNode.next.val<maxNode.val)
        {
          currNode.next=currNode.next.next;
        }
        else
        {   currNode=currNode.next;
            maxNode=currNode;
            }
        }
    
         return reverseList(head);
    }
}