class Solution {
    public int subtractProductAndSum(int n) {
        int c = 0 ;
        int a = 0 ;
        int b = 0 ;
        int sum = 0 ;
        int product = 1 ;
        while( n > 0 ){
            int d = n % 10; 
            sum = sum + d;
            product = product * d;
            n = n / 10 ;
        }
        a = product;
        b = sum;
        c = a - b ;
        return c;
    }
}