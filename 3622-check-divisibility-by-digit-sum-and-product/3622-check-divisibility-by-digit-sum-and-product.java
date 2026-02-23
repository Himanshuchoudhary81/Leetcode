class Solution {
    public boolean checkDivisibility(int n) {
        int x = n ;
        int sum = 0 ;
        int pro = 1 ;
        while( n > 0 ){
            int d = n % 10;
            sum = sum + d ;
            pro = pro * d;
            n = n /10;
        }
        int c = sum + pro ;
        if(  c == 0) return false;
        else return x % c == 0 ;
    }
}