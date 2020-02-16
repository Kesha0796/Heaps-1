class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums==null || nums.length==0)
            return 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> b-a);
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        int result=0;
        for(int i=0;i<k;i++)
        {
            result=pq.poll();
        }
        return result;
    }
}

// Time Complexity: O(k*log(n))
// Space Complexity: O(n)