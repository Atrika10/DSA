public class RemoveDuplicate {

    // Time Complexity of this code = O(n) + O(n) => O(2n) => O(n)
    // Space Complexity of this code = O(n)
    public static int removeDuplicates(int[] nums) {
        int k=0;
        int n =nums.length;
        int i=1; int j=0;
        int newArr[] = new int[n];

        newArr[0] = nums[0]; k++;
        while (i < n) {
            if (nums[i] != newArr[j]) {     // unique elem
               j++;
               newArr[j] = nums[i];
               k++; // unique elements
            }
            i++; // i will be increase in both condition (equal or not equal)
        }
        for (int l = 0; l < newArr.length; l++) {
            nums[l] = newArr[l];
        }
      
        return k;
    }
    public static void main(String[] args) {
        int num[] = {1,1,2};
        System.out.println(removeDuplicates(num));
    }
}
