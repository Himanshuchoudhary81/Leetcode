class Solution {
    public int minElement(int[] nums) {
        int n = nums.length ;
        int arr[] = new int[n] ;

        for( int i = 0 ; i < nums.length ; i ++ ){
            int sum = 0 ;
            int k = nums[i];

           while( k > 0 ){
            int a = k % 10 ;
            sum = sum + a ;
            k = k / 10 ;
           }
            arr[i] = sum ;
        }

        int min = Integer.MAX_VALUE ;

        for( int i = 0 ; i < arr.length ; i ++){
            min = Math.min( min , arr[i] );
        }
        return min ;
    }
}