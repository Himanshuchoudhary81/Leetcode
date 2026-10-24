class Solution {
    public int mySqrt(int x) {
        
        int low = 1 ;
        int high = x ;
        int a = 0 ;

        while( low <= high){
            int mid = low + ( high - low )/2 ;

            if( (long) mid * mid <= x){
                a = mid ;
                low = mid + 1 ;
            }
            else{
                high = mid - 1 ;
            }
        }
        return a ;
    }
}