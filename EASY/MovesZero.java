public class MovesZero {
    // Time complexity = O(n)
    // Space complexity = O(1)
    public static void moveZeroes(int[] nums) {
        
       int j=0;
       // move all non zero elements to the front
       for(int i=0; i<nums.length; i++){
        if(nums[i] !=0){    // found non zero element
            nums[j] = nums[i];
            j++;
        }
       }

       // fill remaining position with zero
       for (int i = j; i < nums.length; i++) {
        nums[i] = 0;
       }
    }
    public static void main(String args[]){
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
