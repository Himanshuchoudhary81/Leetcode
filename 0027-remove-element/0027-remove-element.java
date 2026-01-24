class Solution {
    public int removeElement(int[] nums, int val) {

        int i = 0;
        int n = nums.length;
        int count = 0;
        for( i = 0  ; i < n ; i++){
            if( nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}