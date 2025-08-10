public class Solution {
    /*private int getLength(ListNode head)
    { int count=0;
    ListNode temp=head;
     while(temp.next!=null)
     {
        count++;
        temp=temp.next;
     }
return count;
    }
    */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       /* int lenA=getLength(headA);
        int lenB=getLength(headB);

        ListNode ptrA=headA;
        ListNode ptrB=headB;

        if(lenA>lenB)
        {
            for(int i=0;i<(lenA-lenB-1);i++)
            ptrA=ptrA.next;
        }
        else{
            for(int i=0;i<(lenB-lenA-1);i++)
            {
                ptrB=ptrB.next;
            }
        }
        while(ptrA!=null && ptrB!=null)
        {
            if(ptrA==ptrB)
            return ptrA;

            ptrA=ptrA.next;
            ptrB=ptrB.next;
        }
        return null;
*/

if(headA==null || headB==null)
return null;

ListNode ptrA=headA;
ListNode ptrB=headB;

while(ptrA!=ptrB)
{
    ptrA=(ptrA==null)?headB:ptrA.next;
    ptrB=(ptrB==null)?headA:ptrB.next;
}
return ptrA;
    }
}