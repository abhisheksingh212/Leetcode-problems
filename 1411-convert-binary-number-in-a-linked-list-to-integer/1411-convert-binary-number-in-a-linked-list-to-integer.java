
class Solution {
    public int getDecimalValue(ListNode head) {
        int[] arr=new int[30];
    ListNode temp=head;
    int i=0;
    while(temp!=null)
    {   arr[i]=temp.val;
         i++;
        temp=temp.next;
    }
    int sum=0;
    for(int j=0;j<i;j++)
    {
        sum=(sum << 1) | arr[j] ;

    }
       return sum; 
    }
}