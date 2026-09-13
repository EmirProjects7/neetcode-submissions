class Solution {
    public boolean hasDuplicate(int[] nums) {
    Set<Integer> numsCopy = new HashSet<>();

        for(int num : nums){
            if(numsCopy.contains(num))
            return true;
        numsCopy.add(num);
        }
        return false;
    }
}