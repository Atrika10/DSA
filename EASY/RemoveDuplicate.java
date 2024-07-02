import java.util.ArrayList;

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

    public static int removeDuplicates2(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        // add first element
        al.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if(al.get(al.size()-1) != nums[i]) {
                al.add(nums[i]);
            }
        }
        // put all the elements in the array from arraylist
        for(int i=0; i<al.size(); i++) {
            nums[i] = al.get(i);
        }
        return al.size();

    }
    public static void main(String[] args) {
        int num[] = {1,1,2};
        System.out.println(removeDuplicates2(num));
    }
}
