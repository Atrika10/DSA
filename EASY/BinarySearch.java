public class BinarySearch{
    public static int findIdx(int[] nums, int target, int st, int end){
        //base case
        if(st > end){
            return -1;
        }
        
        // find mid index
        int mid = (st+end)/2;
        if(nums[mid] ==target){
            return mid;
        }
        // mid > target  -> search in left side
        if(nums[mid] > target){
            return findIdx(nums, target, st, mid-1);
        }else{
            // mid < target  -> search in right side
            return findIdx(nums, target, mid+1, end);
        }
        
    }
    public static int search(int[] nums, int target) {
 
        return findIdx(nums, target, 0, nums.length-1);
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,19,12}, target = 9;
        System.out.println(search(nums, target));
    }
}