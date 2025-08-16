class Solution {
    public ListNode rotateRight(ListNode head, int k) {
if(head==null || head.next==null ||k==0)return head;

int len=getLength(head);
k=k%len;
if(k==0)return head;

ListNode fast=head,slow=head;
for(int i=0;i<k;i++)
{
    fast=fast.next;
}

while(fast.next!=null)
{
    slow=slow.next;
    fast=fast.next;
}

ListNode newHead=slow.next;
slow.next=null;
fast.next=head;
return newHead;
}

private int getLength(ListNode head)
{
    int len=0;
    ListNode temp=head;
    while(temp!=null)
    {
        len++;
        temp=temp.next;
    }
    return len;
}
}