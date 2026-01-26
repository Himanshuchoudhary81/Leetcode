class Solution {
    public void rotate(int[][] matrix) {
         
         int temp = 0 ;
        for(int i = 0 ; i < matrix.length ; i++){
            for( int j = i ; j < matrix.length ; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int tem = 0;

        for( int i = 0 ;i <  matrix.length ; i++){
            int left = 0;
            int right = matrix.length -1;
            while(left < right){
                tem = matrix[i][right];
                matrix[i][right] = matrix[i][left];
                 matrix[i][left] = tem;
                left++;
                right--;
            }
        }

          
    }
}