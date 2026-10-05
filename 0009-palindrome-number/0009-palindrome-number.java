class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0 ;
        int temp = x ;
        if( temp < 0 ){
            return false ;
        }
        else{
            while( temp > 0){
                int a = temp % 10 ;
                rev = (rev * 10) + a ;
                temp = temp / 10 ;
            }
            if(rev == x ){
                return true ;
            }
        }
        return false ;
    }
}