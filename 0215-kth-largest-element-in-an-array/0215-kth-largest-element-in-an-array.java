class Solution {
    public int findKthLargest(int[] nums, int k) {
        int a = 0 ;
        Arrays.sort(nums);
        for( int i = nums.length - 1 ; i >= 0   ; i -- ){
            if( i == nums.length - k ){
              a = nums[i];
            }
        }
        return a ;
    }
}