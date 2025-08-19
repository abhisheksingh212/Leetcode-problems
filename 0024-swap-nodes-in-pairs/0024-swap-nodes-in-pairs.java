
class Solution {
    private ListNode reverseKGroup(ListNode head, int k) {
    ListNode curr = head;
    int count = 0;
    while (curr != null && count < k) {
        curr = curr.next;
        count++;
    }
    if (count == k) {
        curr = reverseKGroup(curr, k);
        while (count > 0) {
            ListNode next = head.next;
            head.next = curr;
            curr = head;
            head = next;
            count--;
        }
        head = curr;
    }
    
    return head;
}
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;

        ListNode rev=reverseKGroup(head,2);
        return rev;
        
    }
    
}