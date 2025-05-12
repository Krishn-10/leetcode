// Name - 2302. Count Subarrays With Score Less Than K
// Level - Hard
// Time Complexity - O(nlogn)
// Time Complexity - O(1)
// Approach - Sliding Window


class Solution {
    public long countSubarrays(int[] nums, long k) {
        int start = 0;
        long sum = 0;
        long count = 0;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum * (end - start + 1) >= k) {
                sum -= nums[start];
                start++;
            }
            count += (end - start + 1);
        }
        
        return count;
    }
}
