/*Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */
/*Time & Space Complexity of this code = O(n) */

import java.util.HashMap;
import java.util.Set;

public class MajorityElem {
    public static int majorityElement(int[] nums) {
        int n = nums.length/2;
        HashMap<Integer, Integer> hm =  new HashMap<>();
        // put all the element with freq
        for (int i = 0; i < nums.length; i++) {
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }else{
                hm.put(nums[i], 1);
            }
        }

        // check the freq of elem; 
        // Traverse entire hasmap
        Set<Integer> keys = hm.keySet();
        for (Integer eachKey : keys) {
            if(hm.get(eachKey) > n){   // if the freq of key is greater than n, then print that key
                return eachKey; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2}; //2
        System.out.println(majorityElement(nums));
    }
}
