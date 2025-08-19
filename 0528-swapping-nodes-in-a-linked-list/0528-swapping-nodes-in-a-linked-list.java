import java.util.*;
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null)
        {
            list.add(curr.val);
            curr=curr.next;
        }  

        int n=list.size();      
        Collections.swap(list,k-1,n-k);

        ListNode res=new ListNode(0);
        ListNode temp=res;
        for(int val:list)
        {
            temp.next=new ListNode(val);
            temp=temp.next;
        }
        return res.next;

        
    }
}