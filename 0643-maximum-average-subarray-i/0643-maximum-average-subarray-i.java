class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0 ;
        for( int i = 0 ; i < k ; i ++){
            sum = sum + nums[i];
        }
        double max = sum ;
        int startIndex = 0;
        int endIndex = k ;
        while( endIndex < nums.length){
            sum = sum - nums[startIndex];
            startIndex ++;

            sum = sum + nums[endIndex];
            endIndex++;

            max = Math.max( max , sum);
        }
        return max/k ;
    }
}