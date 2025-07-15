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
       //slow fast approach
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       } 
        
return slow;
    }
    public ListNode deleteMiddle(ListNode head) {
        ListNode mid=middleNode(head);
        if(head==null || head.next==null)
        {
         return null;
        }
        ListNode temp=head;
        if(temp==mid)
           {
            return temp.next;
           }
        while(temp!=null && temp.next!=null)
        {   if(temp.next==mid)
            { 
              temp.next=temp.next.next;
              break;
            }
            temp=temp.next;
        }
return head;
    }
}