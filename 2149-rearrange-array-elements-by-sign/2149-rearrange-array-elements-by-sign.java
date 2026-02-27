class Solution {
    public int[] rearrangeArray(int[] nums) {
        int k = 0 ;
        int j = 1;
        int n = nums.length;
        int arr[] = new int [n];
        for( int i = 0 ; i < n ; i ++){
          if( nums[i] > 0){
            arr[k] = nums[i];
            k = k + 2;
          }
          else{
            arr[j] = nums[i];
            j = j + 2;
          }
        }
        return arr;
    }
}