class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length; 
        int m = grid[0].length;

        int[] oneRow = new int[n]; 
        int[] oneCol = new int[m]; 
        int[] zeroRow = new int[n]; 
        int[] zeroCol = new int[m];
        
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(grid[row][col] == 0){
                    zeroRow[row]++;
                    zeroCol[col]++;  
                }

                if(grid[row][col] == 1){
                    oneRow[row]++;
                    oneCol[col]++;
                }
            }
        }

        int[][] result = new int[n][m];
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                result[row][col] = oneRow[row] + oneCol[col] - zeroRow[row] - zeroCol[col];
            }
        }

        return result;
    }
}