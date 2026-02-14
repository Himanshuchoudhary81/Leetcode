class Solution {
    public int mirrorDistance(int n) {
        int a = n ;
        int rev = 0 ;
        while( n > 0 ){
        int d = n % 10 ;
        rev = rev * 10 + d;
        n = n / 10 ;
        }
        int c = rev - a ;
        if( c > 0 ){
        return c ;
        }
        else{
            return c * (-1);
        }
    }
}