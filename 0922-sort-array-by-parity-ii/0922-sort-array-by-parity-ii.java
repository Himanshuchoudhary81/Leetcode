class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int count = 0 ; 
        int count1 = 1 ;
        int n = nums.length;
        int arr[] = new int[n];
        for( int i = 0 ; i < n ; i ++){
           if( nums[i] % 2 == 0){
            arr[count] = nums[i] ;
            count = count + 2 ;
           }
           else{
            arr[count1] = nums[i];
            count1 = count1 + 2 ;
           }
        }
       return arr; 
    }
}