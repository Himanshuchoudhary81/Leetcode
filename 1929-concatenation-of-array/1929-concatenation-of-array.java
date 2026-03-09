class Solution {
    public int[] getConcatenation(int[] nums) {
        int count = 0 ;
        int n = nums.length;
        int c = 2 * n ;
        int arr[] = new int[c];
        for( int i = 0 ; i < n ; i ++){
            arr[count++] = nums[i];
        }
        for( int i = 0 ; i < n ; i ++){
            arr[count++] = nums[i];
        }
        return arr;
        
    }
}