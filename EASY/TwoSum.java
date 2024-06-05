public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int arr[] = new int[2];
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,4}, target = 6;
        int ans[] = new int[2];
        ans = twoSum(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
