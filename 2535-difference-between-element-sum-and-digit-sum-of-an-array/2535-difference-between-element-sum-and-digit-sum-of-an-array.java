class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int sum = 0 ;
        int sum2 = 0;
        for( int i = 0 ; i < n ; i ++){
            int m = nums[i];
           sum = sum + nums[i];
           while( m > 0 ){
            sum2 = sum2 + m % 10;
            m = m / 10 ;
           }
        }
        return Math.abs( sum - sum2);
    }
}