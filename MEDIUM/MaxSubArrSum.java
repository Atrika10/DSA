public class MaxSubArrSum {
    // Time Complexity of this code = O(n^3) Brute Force approach
    public static int maxSubArray1(int[] nums) {
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
           
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }

                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
            
        }
        return maxSum;
    }

    // using prefix sum
    // Time Complexity of this code = O(n^2)
    public static int maxSubArray2(int[] nums) {
        // take another array to store the sum of the subarray
        int prefixSum[] = new int[nums.length];
        int maxSum = Integer.MIN_VALUE;
        prefixSum[0] = nums[0];

        // calculate prefixSum
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i]; 
        }

        // calculate the maxSum of the subarray
        for(int i=0; i< nums.length; i++){
            for (int j = i; j < prefixSum.length; j++) {
                int sum = (i==0) ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];

                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    // Kadane's Algorithm
    // Time Complexity of this code = O(n)
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE; // maximum sum
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum > maxSum) {
                maxSum = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
        
    }

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
