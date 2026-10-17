class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length ;
       k = k % n ;
       int j = n - 1 ;
       int temp = 0 ;
       
       int i = 0 ;
       while(i < j ){
          temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp ;
          i++;
          j-- ;
       }

       int q = k - 1 ;
       int m = 0 ;
       while( m < q ){
          temp = nums[m];
          nums[m] = nums[q];
          nums[q] = temp ;
          m++;
          q-- ;
       }

       int g = n - 1 ;
       int z = k ;
       while( z < g ){
          temp = nums[z] ;
          nums[z] = nums[g];
          nums[g] = temp ;
          z++;
          g-- ;
       }
    }
}