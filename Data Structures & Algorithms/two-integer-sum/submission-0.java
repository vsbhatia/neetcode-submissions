class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> expectedForPresent = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer found = expectedForPresent.get(nums[i]);
            if (found != null) {
                // res = {found,i};
                res[0] = found;
                res[1] = i;
            }
            expectedForPresent.put(target - nums[i], i);
        }
        return res;
    }
}
