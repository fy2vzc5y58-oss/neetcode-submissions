class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }

        HashSet val = new HashSet<Integer>();

        for (int n : nums) {
            val.add(n);
        }

        if (val.size() == nums.length) {
            return false;
        }

        return true;
    }
}