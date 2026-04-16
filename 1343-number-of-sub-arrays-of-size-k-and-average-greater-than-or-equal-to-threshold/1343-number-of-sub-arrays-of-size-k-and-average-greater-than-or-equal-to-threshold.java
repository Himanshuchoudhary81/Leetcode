class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0 ;
        int count = 0 ;
        for( int i = 0 ; i < k ; i ++){
           sum = sum + arr[i];
        }
        if( sum  >= threshold * k){
            count++;
        }
        int start = 0 ;
        int end = k ;
        while( end < arr.length ){
            sum = sum - arr[start];
            start++ ;

            sum = sum + arr[end];
            end++ ;

            if( sum  >= threshold * k){
                count++;
            }
            
        }
        return count ;
    }
}