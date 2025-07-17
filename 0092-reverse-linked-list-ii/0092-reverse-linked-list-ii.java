
class Solution {
     private ListNode RightNode(ListNode head, int right)
    {ListNode temp = head;
    int i = 1;
    while (i < right && temp != null) {
        i++;
        temp = temp.next;
    }
    return temp;
}
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head!=null && left==right){
             return head;
        }
       
    ListNode beforeLeft = null;
    ListNode temp = head;
    int i = 1;
    while (i < left) {
        beforeLeft = temp;
        temp = temp.next;
        i++;
    }
        ListNode leftNode=temp;
        ListNode rightNode=RightNode(head,right);
        ListNode afterRight=rightNode.next;

        ListNode prev=null;
        ListNode curr=leftNode;
        ListNode next;
        while(curr!=afterRight)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
    if (beforeLeft != null) {
    beforeLeft.next = prev;
    } else {
    head = prev;
    }

    leftNode.next = afterRight;

    return head;
    }
}