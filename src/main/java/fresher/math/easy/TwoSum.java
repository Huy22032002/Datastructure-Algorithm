package fresher.math.easy;

import java.util.*;

public class TwoSum {

    /*
        Time complexity: O(n^2)
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i < nums.length - 1; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (target == nums[i] + nums[j]) return new int[]{i,j};
        return new int[]{0,0};
    }

    /*
        Time Complexity: O(n)
     */
    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> set = new HashMap<>();
        set.put(nums[0], 0);

        for(int i = 1; i < nums.length; i++) {
            int temp = target - nums[i];
            if(set.containsKey(temp)) return new int[]{set.get(temp), i};
            else set.put(nums[i], i);
        }

        return new int[]{0,0};
    }

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4};

        TwoSum twoSum = new TwoSum();
        System.out.println("Two Sum brute force: " + Arrays.toString(twoSum.twoSum(arr, 5)));
        System.out.println("Two Sum hash set: " + Arrays.toString(twoSum.twoSumHashMap(arr,7)));
    }
}
