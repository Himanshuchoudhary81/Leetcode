class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length ;
        int count = 0 ;
        int sum = 0 ;
        int sum1 = 0 ;
        for( int i = 0 ; i < n; i ++ ){
            sum = sum + nums[i];
        }
        for( int i = 0 ; i < n - 1; i ++ ){
            sum1 = sum1 + nums[i];
            int c = sum1 -(sum - sum1) ;
            if(c % 2 == 0){
                count++ ;
            }
        }
        return count ;
    }
}