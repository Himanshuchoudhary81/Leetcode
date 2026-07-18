class Solution {
    public int repeatedNTimes(int[] nums) {
        int c = nums.length / 2 ;
        for( int i = 0 ; i < nums.length ; i ++ ){
            int count = 0 ;
            for( int j = 0 ; j < nums.length ; j ++ ){
                if( i != j && nums[i]==nums[j]){
                    count ++ ;
                }
            }
            if( count == c - 1){
                return nums[i];
            }
        }
        return -1 ;
    }
}