//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].


import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,4};
        int target = 6;
        System.out.println(sumNumb(arr,target));

    }


    // Brute Force
    public static String sumNumb(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target && i != j){
                    return Arrays.toString(new int[]{i, j});
                }
            }
        }
        return "new int[]{};";
    }

    // One-pass Hash Table
    //{3,2,4} , target = 6
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
            // 3, 0
            // 2, 1

        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
