class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE ;
        int low = 0 , high = 0 , sum = 0 ;

        while( high < nums.length ){
            sum = sum + nums[high] ;
            
            while( sum >= target ){
                min = Math.min( min , ( high - low ) + 1 );
                sum = sum - nums[low++];
            }
            if ( sum < target ){
                high ++ ;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min ;
    }
}