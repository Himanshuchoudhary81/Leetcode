class Solution {
    public boolean isPalindrome(int x) {
        int d = 0 ;
        if( x < 0 ) return false;
        int rev = 0 ;
        int num = x ;
         
         while( num > 0 ){
             d = num % 10;
             rev = rev * 10 + d ;
             num = num/10;
         }

         if(rev == x ){
            return true;
         }


       return false; 
    }
}