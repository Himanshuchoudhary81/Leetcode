class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count = 0;
        int arr[] = new int[nums1.length + nums2.length];
        for( int i = 0 ; i < nums1.length ; i ++){
            arr[count++] = nums1[i];
        }
        for( int j = 0 ; j < nums2.length ; j++){
            arr[count++] = nums2[j];
        }
        Arrays.sort( arr );
        
        int a = arr.length;
        if( a % 2 == 1){
            return ( double ) arr[ a/2 ];
        }
        else{
            int m1 = arr[ a/2 -1];
            int m2 = arr[ a/2 ];
            return ((double) m1 + (double) m2) / 2;
        }
        
    }
}