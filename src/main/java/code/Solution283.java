package code;

public class Solution283 {
    public void moveZeroes(int[] nums) {
		if (nums == null) {
			return;
		}
		int offset = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[offset] = nums[i];
                offset++;
			}
		}
		for (int i = offset; i < nums.length; i++) {
			nums[i] = 0;
		}
    }
}
