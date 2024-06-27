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
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7}, k = 15;
        rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        
    }
}
