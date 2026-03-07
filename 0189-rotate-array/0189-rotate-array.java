class Solution {
    public void rotate(int[] nums, int k) {
        int count = 0 ;
        int n = nums.length;
        k = k % n ;
        int arr[] = new int [n] ;

        for( int i = n - k ; i <= n - 1 ; i ++){
            arr[count] = nums[i];
            count++;
        }
        for( int i = 0 ; i < n - k ; i ++){
            arr[count] = nums[i];
            count++;
        }
        for( int i = 0 ; i < n ; i ++){
            nums[i] = arr[i];
        }
    }
}