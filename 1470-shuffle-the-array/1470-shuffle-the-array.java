class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m = nums.length;
        int c = m/2 ;
        int count1 = 0;
        int count2 = 1;
        int arr[] = new int[m];
        for( int i = 0 ; i <= c - 1  ; i ++ ){
            arr[count1] = nums[i];
            count1 = count1 + 2 ;
        }
        for( int i = c  ; i < m ; i++ ){
            arr[count2] = nums[i];
            count2 = count2 + 2 ;
        }
        return arr;
    }
}