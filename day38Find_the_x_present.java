class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        int a=mat.length;
        int b=mat[0].length;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(mat[i][j]==x)
                  return true;
            }
        }
        return false;
    }
}