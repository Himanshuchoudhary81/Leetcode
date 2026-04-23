class Solution {
    public int findMin(int[] nums) {
        int low = 0 ; 
        int heigh = nums.length - 1 ;
        if( nums[low] < nums[heigh]) return nums[low] ;

        while(low < heigh){
            int mid = low + ( heigh - low) / 2;
            if( nums[mid] > nums[heigh]){
                low = mid + 1 ;
            }
            else if ( nums[mid] < nums[heigh]){
                heigh = mid ;
            }
            else{
                heigh -- ;
            }
        }
        return nums[low];
    }
}