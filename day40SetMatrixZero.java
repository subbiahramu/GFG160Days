class Solution {
    public void setMatrixZeroes(int[][] mat) {
        int n = mat.length; 
        int m = mat[0].length; 
        boolean[] rowFlags = new boolean[n];
        boolean[] colFlags = new boolean[m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    rowFlags[i] = true;
                    colFlags[j] = true;
            }
        }}
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (rowFlags[i] || colFlags[j]) {
                    mat[i][j] = 0;
                }
            }
        }
    }
}