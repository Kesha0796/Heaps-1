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
        ListNode dummy=new ListNode(Integer.MIN_VALUE);
        ListNode result=dummy;
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b) -> a.val-b.val);
        for(ListNode n:lists)
        {
            if(n!=null)
                pq.add(n);
        }
        while(!pq.isEmpty())
        {
            ListNode temp=pq.poll();
            dummy.next=temp;
            dummy=dummy.next;
            if(temp.next!=null)
                pq.add(temp.next);
        }
        return result.next;
    }
}

// Time Complexity: O(k*n)
// Space Complexity: O(k), k= number of lists