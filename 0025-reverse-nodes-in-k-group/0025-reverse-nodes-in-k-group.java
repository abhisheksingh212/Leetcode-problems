class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1 )return head;

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevgroupEnd = dummy;

        while(true)
        {
            ListNode kthNode = prevgroupEnd;
            for(int i=0;i<k && kthNode !=null ;i++)
            {
                kthNode=kthNode.next;
            }
            if(kthNode == null)break;

           ListNode nextgroupStart = kthNode.next;

            ListNode prev = nextgroupStart;
            ListNode curr = prevgroupEnd.next;

            while(curr!=nextgroupStart)
            {
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            } 

            ListNode originalgroupStart = prevgroupEnd.next;
            prevgroupEnd.next=kthNode;
            prevgroupEnd = originalgroupStart;
        }
     return dummy.next;   
    }
}