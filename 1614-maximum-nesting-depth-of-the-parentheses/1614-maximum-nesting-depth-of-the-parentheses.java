class Solution {
    public int maxDepth(String s) {
        int n = s.length();

        int curr = 0;
        int max = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                // nesting starts
                curr++;
                max = Math.max(max, curr);
            }else if(ch==')'){
                // nesting ends
                curr--;
            }
        }
        return max;
    }
}