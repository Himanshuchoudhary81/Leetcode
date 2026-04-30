class Solution {
    public int dominantIndex(int[] nums) {
        int count = 0 ;
        int a =  0 ;
        int n = nums.length ;
        int max = Integer.MIN_VALUE ;
        for( int i = 0 ; i < n ; i ++ ){
            max = Math.max( max , nums[i] );
        }
        for ( int k = 0 ; k < n ; k ++ ){
            if( nums[k] == max ){
               a = k ;
            }
        }
        Arrays.sort( nums );


        for( int j = 0 ; j < n -1 ; j ++ ){
            if( max >= 2 * nums[j]){
               count++ ;
            }
            if( count == n - 1) {
                return a ;
            }
        }
        return -1 ;
    }
}