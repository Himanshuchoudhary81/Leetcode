class Solution {
    public int[] twoSum(int[] nums, int target) {
       
       HashMap<Integer,Integer> numMap = new HashMap<>();
       int n = nums.length ;

       for( int i = 0 ; i < nums.length ; i ++ ){
           int a = target - nums[i];
           if( numMap.containsKey(a)){
              return new int[]{numMap.get(a) , i};
           }
           numMap.put(nums[i] , i);
       }
       return new int[]{};
    }
}