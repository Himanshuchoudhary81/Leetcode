class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for( int i = 0 ; i < n ; i ++){
            if( prefix  == 0){
                prefix = 1;
            }
           prefix = prefix * nums[i];
           max = Math.max( prefix , max);
        }
        for( int j = n - 1 ; j >= 0 ; j --){
             if( suffix == 0){
                suffix = 1;
            }
            suffix = suffix * nums[j];
            max1 = Math.max( suffix , max1);
        }
        int c = Math.max( max , max1);
        return c;
    }
}