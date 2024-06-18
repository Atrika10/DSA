public class ProductOfArray{
    // Approach
    // To calculated product Except current element
    // product of left elements * product of right elements
    // create 2 array(left & right) to store the product of left elements for each index & right elements for each index respectively
    // Finally multipy left product & right product for each index.
    
    public static int[] productExceptSelf(int[] nums) {
         
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];

        // calculate the product of left elements
        left[0] = 1;
        for(int i=1; i<n; i++){
            left[i] = left[i-1]*nums[i-1];
        }

        // calculate the product of right elements
        right[n-1] = 1;
        for (int i = n-2; i > -1; i--) {
            right[i] = right[i+1]*nums[i+1];
        }

        //calculate product for each index
        for (int i = 0; i < n; i++) {
            nums[i] = left[i]*right[i];
        }
        return nums;
        
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int ans[]= productExceptSelf(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}