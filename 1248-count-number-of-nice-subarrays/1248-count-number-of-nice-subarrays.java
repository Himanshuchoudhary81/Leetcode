class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int odd = 0 ;
        int temp = 0 ;
        int j = 0 ;
        int c = 0 ;
        for( int i = 0 ; i < nums.length ; i ++ ){
            if(nums[i] % 2 != 0){
                odd++ ;
                temp = 0 ;
            }
            while( odd == k ){
                temp++ ;
                if(nums[j] % 2 != 0){
                    odd--;
                }
                j++;
            }
            c = c + temp ;
        }
        return c ;
    }
}