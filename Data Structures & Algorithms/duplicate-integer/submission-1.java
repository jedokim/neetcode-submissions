class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seenNumber = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (seenNumber.contains(nums[i])){
                return true;
            }
            seenNumber.add(nums[i]);
        }
        return false;
    }
}