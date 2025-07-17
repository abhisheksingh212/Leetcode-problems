
class Solution {
    private ListNode midNode(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
       if(head==null || head.next==null)
       {
        return true;
       }

        ListNode midNode =midNode(head);

        ListNode prev=null;
        ListNode curr=midNode;
        ListNode next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        ListNode left=head;
        ListNode right=prev;

        while(right!=null)
        {
            if(left.val!=right.val)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

        
    }
}