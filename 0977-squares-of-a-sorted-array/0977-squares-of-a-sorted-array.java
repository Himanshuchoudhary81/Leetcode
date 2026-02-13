class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int count = 0 ;
        for( int i = 0 ; i < n ; i ++){
            nums[count] = (nums[i]* nums[i]);
            count++;
        }
        Arrays.sort(nums);
        return nums;
    }
}