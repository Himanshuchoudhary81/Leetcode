class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       
       List<Integer> duplicate = new ArrayList<>();

       for( int num : nums ){
        int idx = Math.abs(num) - 1;
        if(nums[idx] < 0 ){
            duplicate.add(idx + 1 );
        }
        else {
            nums[idx] *= -1 ;
        }
       }
       return duplicate;
    }
}