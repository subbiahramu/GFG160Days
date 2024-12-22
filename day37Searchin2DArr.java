public class MatrixSearch {
    public static boolean searchMatrix(int[][] mat, int x) {
        int n = mat.length;    // Number of rows
        int m = mat[0].length; // Number of columns

        int row = 0, col = m - 1; // Start from the top-right corner

        while (row < n && col >= 0) {
            if (mat[row][col] == x) {
                return true; // Element found
            } else if (mat[row][col] > x) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }
        return false; // Element not found
    }