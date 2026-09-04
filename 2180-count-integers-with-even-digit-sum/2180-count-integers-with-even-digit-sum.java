class Solution {
    public int countEven(int num) {
        int sumofDigit = 0, n = num;
        while(n>0) {
            sumofDigit += n%10;
            n /= 10;
        }
        return sumofDigit%2==1 ? (num-1)/2 : num/2;
    }
}