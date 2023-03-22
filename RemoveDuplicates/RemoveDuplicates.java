package RemoveDuplicates;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicates {
    //region Hash Set with Time Complexity O(n)
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    //endregion

    //region Hash Map with Time Complexity O(n)
    public static boolean containsDuplicateWithHashMap(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }
    //endregion

    //region Array Sort with Time Complexity  O(nlog(n))
    public static boolean containsDuplicateWithArraySort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
    //endregion

    //region If Number is not added to Hash Set
    public static boolean containsDuplicateWithNumNotAddedToSet(int[] nums) {

        boolean duplicate = false;

        //initialise HashSet
        HashSet<Integer> set = new HashSet<>();

        //for aNum in nums array
        for(int aNum : nums)
        {
            //if number is not added to hashset
            if(!set.add(aNum))
                duplicate = true;
        }
        return duplicate;
    }
    //endregion

    //region Main method -Test
    public static void  main(String[] args){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int [] nums1 = {1,2,3,1};
        int [] nums2 = {1,2,3,4};
        int [] nums3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println("\n Using Hash Set");
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));

        System.out.println("\n Using Hash Map ");
        System.out.println(containsDuplicateWithHashMap(nums1));
        System.out.println(containsDuplicateWithHashMap(nums2));
        System.out.println(containsDuplicateWithHashMap(nums3));

        System.out.println("\n Using Array Sort");
        System.out.println(containsDuplicateWithArraySort(nums1));
        System.out.println(containsDuplicateWithArraySort(nums2));
        System.out.println(containsDuplicateWithArraySort(nums3));

        System.out.println("\n If Number is not added to Hash Set");
        System.out.println(containsDuplicateWithNumNotAddedToSet(nums1));
        System.out.println(containsDuplicateWithNumNotAddedToSet(nums2));
        System.out.println(containsDuplicateWithNumNotAddedToSet(nums3));
    }
    //endregion
}
