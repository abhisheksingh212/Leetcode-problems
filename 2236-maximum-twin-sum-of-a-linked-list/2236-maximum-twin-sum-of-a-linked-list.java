
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
    public int pairSum(ListNode head) {
        int size=0;
        ListNode temp=head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        int max=Integer.MIN_VALUE;
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

        while(left!=null && right!=null)
        {
            if((left.val +right.val)>max)
            {
                max=left.val+right.val;
            }
            else
            {
                left=left.next;
                right=right.next;
            }
        }
       
        return max;
    }
}