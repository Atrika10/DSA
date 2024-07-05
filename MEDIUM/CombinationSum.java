import java.util.*;

public class CombinationSum {

    public static void findCombinations(int[] candidates, int target, int idx, List<Integer> list, List<List<Integer>> result){
        // base case
        if(idx == candidates.length){
            if (target ==0) {
                result.add(new ArrayList<>(list));
            }
            return;
        }

        // work
        // pick an element
        if(candidates[idx] <= target){
            list.add(candidates[idx]);
            findCombinations(candidates, target-candidates[idx], idx, list, result);    // still stay at the same index as we can pick the same element again
            list.remove(list.size()-1);         // remove the last element as this element when picked did not lead to a valid combination
        }
        // not pick an element
        findCombinations(candidates, target, idx+1, list, result);
    }

    
     public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    public static void main(String[] args) {
        int candidates[] = {2,3,6,7};
        int target = 7;
        combinationSum(candidates, target);
    }
}
