public class counthiddensequence {
    public static void main(String[] args) {
        int[] arr = {4,-7,2};
        System.out.println(solution3(arr, 6, 3));
    }

    //Brute Force - O(n^2)
//    public static int solution(int[] arr, int upper, int lower){
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//                int j = lower;
//                int k = upper;
//                int ans = 0;
//                while(j<k){
//                    if(k-j == arr[i]){
//                        ans++;
//                        j++;
//                        k--;
//                    }
//                    else if(k-j<arr[i])
//                        j++;
//                    else
//                        k--;
//                }
//                max += ans;
//        }
//        return max;
//    }
//    public static int solution(int[] arr, int upper, int lower){
//        int max = 0;
//        for (int i = upper; i >=lower ; i--) {
//            int lastelement = i;
//            int j = arr.length-1;
//            while(j>=0 && lastelement-arr[j]>=lower && lastelement-arr[j]<=upper){
//                lastelement = lastelement - arr[j];
//                j--;
//            }
//            if(j==-1) {
//                max++;
//            }
//        }
//        return max;
//
//    }

    //Optimized O((Upper−Lower+1)∗Arr.Length)
//    public static int solution2(int[] arr, int upper, int lower){
//        int ans = 0;
//
//        for(int i=upper;i>=lower;i--){
//            int firstele = i;
//            int j = 0;
//            while(j<arr.length && firstele+arr[j]<=upper && firstele+arr[j]>=lower){
//                firstele = firstele+arr[j];
//                j++;
//            }
//
//            if(j==arr.length)
//                ans++;
//        }
//        return ans;
//    }

    //Optmized Pro O(n)
    public static int solution3(int[] arr,int upper, int lower){
        long currvalue = 0;
        long maxvalue = 0;
        long minvalue = 0;
        for (int i = 0; i < arr.length; i++) {
            currvalue += arr[i];
            maxvalue = Math.max(maxvalue, currvalue);
            minvalue = Math.min(minvalue, currvalue);
        }
        long ans = (upper-lower) - (maxvalue-minvalue) + 1;
        if(ans>=0)
            return (int)ans;
        return 0;
    }
}
