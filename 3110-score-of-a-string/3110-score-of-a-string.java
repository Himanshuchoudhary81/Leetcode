class Solution {
    public int scoreOfString(String s) {
        int sum = 0 ;
        for( int j = 0 ; j < s.length() - 1 ; j ++){
            sum += Math.abs(s.charAt(j) - s.charAt(j + 1));
        }
        return sum;
    }
}