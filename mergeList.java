/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0)
            return null;
        ListNode merged=new ListNode(Integer.MIN_VALUE);
        ListNode result=merged;
        for(ListNode n:lists)
        {
            merged=mergeTwoList(merged,n);
        }
        return result.next;
    }
    
    private ListNode mergeTwoList(ListNode n1, ListNode n2)
    {
        ListNode dummy=new ListNode(-1);
        ListNode result=dummy;
        while(n1!=null && n2!=null)
        {
            if(n1.val<n2.val)
            {
                dummy.next=n1;
                n1=n1.next;
            }
            else
            {
                dummy.next=n2;
                n2=n2.next;
            }
            dummy=dummy.next;
        }
        
        if(n1!=null)
            dummy.next=n1;
        
        if(n2!=null)
            dummy.next=n2;
        
        return result.next;
    }
}

// Time Complexity: O(k*n)
// Space Complexity: O(1)