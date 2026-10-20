class Solution {
    public int[] twoSum(int[] nums, int target) {

        int i = 0;
        int count = 0 ;
        int arr[] = new int[2];
        
        for(  i = 0 ; i < nums.length ; i ++ ){
            for( int j = i + 1 ; j < nums.length ; j ++ ){
                if( nums[i] + nums[j] == target){
                   return  new int[]{i,j};
                }
            }
        }
        return new int[0] ;
    }
}