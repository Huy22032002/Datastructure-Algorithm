package fresher.string.easy;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    /*
        Time complexity: O(n^2)
     */
    public boolean twoSum(int target, int[] arr) {
        for(int i = 0 ; i < arr.length -1 ; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) return true;
            }
        }
        return false;
    }

    /*
        Time Complexity: O(n)
     */
    public boolean twoSumHashMap(int target, int[] arr) {

        Set<Integer> set = new HashSet<>();
        set.add(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            int temp = target - arr[i];
            if(set.contains(temp)) return true;
            set.add(arr[i]);

        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4};

        TwoSum twoSum = new TwoSum();
        System.out.println("Two Sum brute force: " + twoSum.twoSum(8, arr));
        System.out.println("Two Sum brute force: " + twoSum.twoSumHashMap(7, arr));
    }
}
