package code;

public class Solution1 {
    public int[] twoSum (int[] nums, int target) {
        for (int number1 = 0; number1 < nums.length; number1++) {
            for (int number2 = number1 + 1; number2 < nums.length; number2++) {
                if (nums[number1] + nums[number2] == target) {
                    return new int[] {number1, number2};
                }
            }
        } 
        return new int[] {0, 0};       
    }
}