class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int x=nums[n/2];
        return x;
    }
}