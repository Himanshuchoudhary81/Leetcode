class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;
        int count = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                count++;
            }
            if(nums[i] == 1){
                count1++;
            }
            if(nums[i] == 2){
                count2++;
            }
        }
        int idx = 0 ;
        for(int i = 0 ; i < count ; i++){
             nums[idx] = 0 ;
             idx++;
        }
         for(int i = 0 ; i < count1 ; i++){
             nums[idx] = 1 ;
             idx++;
        }
         for(int i = 0 ; i < count2 ; i++){
             nums[idx] = 2 ;
             idx++;
        }
    }
}