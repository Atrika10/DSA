public class RotateArray {

    // Time & Space Complexity = O(n), where n is the size of the given array.
    //Time : 1ms Beats 48.46%
    //Memory : 56.78MB Beats 92.36%

    public static void rotate(int[] nums, int k) {
        
        int n = nums.length;
        // Edge case
        if(k == 0 || k == n){
            return;
        }
        // if k > length of array
        if(k > n){
            k = k%n;    // new k
        }

        int tempArr[] = new int[n];
        //Step -1 find starting index
        int st = n - k;

        //Step -2  fill temp Array from start 
        int i =0;
        while (st < n) {
            tempArr[i] = nums[st];
            st++; i++;
        }

        //Step -3 fill rest of the position of temp array
        i =0;   // to track old array
        for (int j = k; j < tempArr.length; j++) {
            tempArr[j] = nums[i];
            i++;
        }

        //Step -4 update old array
        for (int j = 0; j < tempArr.length; j++) {
            nums[j] = tempArr[j];
        }
    }

    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public static void rotateOptimize(int[] nums, int k) {
        int n = nums.length;
        // Edge case
        if(k == 0 || k == n){
            return;
        }
        // if k > length of array
        if(k > n){
            k = k%n;    // new k
        }
        // Reverse the whole array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the rest of the array
        reverse(nums, k, n - 1);
        
    }
    public static void reverse(int nums[], int st, int end){
        while (st < end) {
            int temp =  nums[st];
            nums[st]=nums[end];
            nums[end] = temp;
            st++; end--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7}, k = 2;
        rotateOptimize(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
    }
}
