// Name - 3392 Count Subarrays of Length Three With a Condition
// Level - Easy
// Time Complexity - O(n)
// Space Complexity - O(1)
// Approach - Brute Force

class Solution {
    public int countSubarrays(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length-2;i++){
            if(2*(nums[i]+nums[i+2])==nums[i+1])
                ans++;
        }
        return ans;
    }
}
