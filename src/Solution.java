public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int breakCheck = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    breakCheck = 1;
                    break;
                }
            }
            if (breakCheck == 1) {
                break;
            }
        }
        return res;
    }
}
