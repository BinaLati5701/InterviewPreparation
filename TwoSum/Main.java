package TwoSum;

public class Main {
    private static int [] nums = {2,7,11,15};
    private static int target = 9;

    private static int[] nums1 = {3,2,4};
    private static int target1 = 6;

    private  static int[] nums2 = {3,3};
    private static int target2 = 6;

    public static void main(String[]args){
        TwoSum sum = new TwoSum();

        sum.TwoSum(nums, target);
        sum.TwoSum(nums1, target1);
        sum.TwoSum(nums2, target2);

        sum.TwoSumWithHashMap(nums, target);
        sum.TwoSumWithHashMap(nums1, target1);
        sum.TwoSumWithHashMap(nums2, target2);

        sum.TwoSumAndTarget(nums, target);
        sum.TwoSumAndTarget(nums1, target1);
        sum.TwoSumAndTarget(nums2, target2);


    }

}
