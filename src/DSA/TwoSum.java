package DSA;

import java.util.Arrays;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        int len = nums.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution obj = new Solution();

        int[] result = obj.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + Arrays.toString(result));
            System.out.println("Numbers: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No solution found.");
        }
    }
}