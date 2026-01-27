class Solution {
    public int maxArea(int[] height) {
        int maxA = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            int area = Math.min(height[left],height[right])*(right-left);
            maxA = Math.max(maxA,area);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxA;
        
    }
}