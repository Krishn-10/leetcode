// Date - 19/04/2025
// Level - Medium
// Time Complexity - O(NLogN)
// Space Complextiy - O(n)
// Approach - Binary Search

class Solution {

    static int smaller(int arr[], int index, int val){
        int idx = -1;
        int i=0;
        int j=index;

        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]>=val){
                idx = mid;
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        return idx;
    }


    static int greater(int arr[], int index, int val){
        int idx = -1;
        int i=0;
        int j=index;

        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]<=val){
                idx = mid;
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return idx;
    }
    public long countFairPairs(int[] arr, int lower, int upper) {
        Arrays.sort(arr);
        long ans = 0;
        int idx = 0;
        int n = arr.length;
        while(idx<n){
            int left = lower-arr[idx];
            int right = upper-arr[idx];

            int x1 = smaller(arr,idx-1,left);
            int x2 = greater(arr,idx-1,right);

            if(x1!=-1 && x2!=-1){
                ans = ans+(x2-x1+1);
            }
            idx++;
        }
        return ans;
    }
}
