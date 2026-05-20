class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seenNumbers = new HashMap<>();
        for (int i = 0; i< nums.length; i++) {
            int lookingFor = target - nums[i];
            if (seenNumbers.containsKey(lookingFor)) {
                return new int[]{seenNumbers.get(lookingFor), i};
            } else {
                seenNumbers.put(nums[i], i);
            }
        }
        return null;
    }
}