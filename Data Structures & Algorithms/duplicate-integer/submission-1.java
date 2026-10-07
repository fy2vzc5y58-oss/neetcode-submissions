class Solution {
    public boolean hasDuplicate(int[] nums) {

        if (nums.length == 0){
            return false;
        }

        HashSet values = new HashSet<Integer>();

        for (int i : nums){
            values.add(i);
        }

        if (values.size() == nums.length){
            return false;
        }

        return true;
        
    }
}