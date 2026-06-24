class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProductWithoutZero = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalProductWithoutZero *= num;
            }
        }

        int[] ansArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                ansArray[i] = 0;
            } else if (zeroCount == 1) {
                ansArray[i] = (nums[i] == 0) ? totalProductWithoutZero : 0;
            } else {
                ansArray[i] = totalProductWithoutZero / nums[i];
            }
        }

        return ansArray;
    }
}
