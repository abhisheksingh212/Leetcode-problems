/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int n=0;
        ListNode temp=head;
        while(temp!=null)
        {  n++;
            temp=temp.next;
        }
        if(n%2==0)
        {  temp=head;
        int i=0;
            while(temp!=null)
            { if(i==(n/2))
            {
                return temp;
            }i++;
                temp=temp.next;
            }
        }
         temp=head;
        int j=1;
        while(temp!=null)
        {
            if(j==(int)(Math.ceil((double)n / 2)))
            {
                return temp;
            }j++;
            temp=temp.next;
        }
return temp;
    }
}