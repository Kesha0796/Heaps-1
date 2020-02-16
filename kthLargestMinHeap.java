class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums==null || nums.length==0)
            return 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
            if(pq.size()>k)
                pq.poll();
        }
        return pq.poll();
    }
}

// Time Complexity: O(n * logk)
// Space Complexity: O(k)