class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n = nums.length ;
       int arr[] = new int[n] ;
       int count = 0 ;
       int j = n/2 ;
       int count1 = 0 ;

       for( int i = 0 ; i < n ; i ++ ){
           if( nums[i] > 0 ){
              arr[count] = nums[i];
              nums[i] = 0 ;
              count++;
            }
        } 
        for( int i = 0 ; i < n ; i ++ ){
            if( nums[i] < 0 ){
                arr[count] = nums[i];
                nums[i] = 0 ;
                count++;
            }
        }
        for( int i = 0 ; i < n/2 ; i ++ ){
           nums[count1] = arr[i];
           count1++;
           nums[count1] = arr[j];
           count1++;
           j++;
        }
        return nums;
    }
}