class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxA = Integer.MIN_VALUE ;
        for( int i = 0 ; i < nums.length ; i++){
            sum = sum + nums[i];
            maxA = Math.max(sum,maxA);
            if(sum < 0){
                sum = 0 ;
            }
        }
        return maxA;
        
    }
}