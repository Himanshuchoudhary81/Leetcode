class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0 ;
        int j = i + 1 ;
        int temp = 0 ;

        while( j < nums.length){
            if( nums[i] == 0 && nums[j] != 0 ){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp ;
                i++;
            }
            if( nums[i] != 0){
                i++;
            }
            j++;
        }
    }
}