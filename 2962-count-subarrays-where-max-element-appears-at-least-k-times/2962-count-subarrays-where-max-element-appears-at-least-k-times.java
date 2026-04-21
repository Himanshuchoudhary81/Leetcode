class Solution {
    public long countSubarrays(int[] nums, int k) {
        int count1 = 0 ;
        int count2 = 0 ;
        int max = Integer.MIN_VALUE ;
        for( int i = 0 ; i < nums.length ; i ++){
            max = Math.max( nums[i] , max );
        }
        int left = 0 ;
        long result = 0 ;

        for( int right = 0 ; right < nums.length ; right ++){
            if( nums[right] == max){
                count1++ ;
            }
            while( count1 == k){
                if( nums[left] == max){
                    count1 -- ;
                }
                left ++ ;
            }
            result = result + left ;
        }
        return result ;
    }
}