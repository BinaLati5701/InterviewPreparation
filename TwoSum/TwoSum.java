package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //region Time Complexity - Quadratic. Not good for interview due to time complexity

    /**
     * Method searches values -loops twice(nested loop)
     * Brute-force solution
     * First loop searches first value
     * Second loop searches second value
     * @param nums
     * @param target
     * @return
     */
    public int[] TwoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int complement = target - nums[i];
                if(nums[j] == complement){
                    return new int[] {i, j};
                }
            }
        }
        throw  new IllegalArgumentException(" No matching numbers found");
    }
    //endregion

    //region Time Complexity - Linear. Good for interview. Faster run.

    /**
     * Method stores values in Hash Map
     * Loops only one time and searches for values in hash map
     * @param nums
     * @param target
     * @return
     */
    public int[] TwoSumWithHashMap(int[] nums, int target){
        Map<Integer, Integer> matchingNums = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(matchingNums.containsKey(complement)){
                return new int[] {matchingNums.get(complement), i};
            }
            matchingNums.put(nums[i], i);

        }
        throw  new IllegalArgumentException("No matching numbers found!");
    }
    //endregion

    //region Another Linear solution using Hash Map.

    /**
     * Method for look up within hash map
     * @param nums
     * @param target
     * @return
     */
    public int[] TwoSumAndTarget(int[] nums, int target){
        Map<Integer, Integer> complements = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer complementIndex = complements.get(nums[i]);
            if(complementIndex != null){
                return new int[] {i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }
    //endregion
}
