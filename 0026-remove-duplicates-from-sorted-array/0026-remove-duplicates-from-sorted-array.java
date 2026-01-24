class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        int n = nums.length;
        int count = 1;
        for( i = 1 ; i < n ; i++){
            for( j = i-1 ; j < i ; j++){
                if(nums[j] != nums[i]){
                 nums[count] = nums[i];
                   count++;
                }

            }
        }
        return count;      
    }
}