class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, top = 0, right = mat[0].length-1, bottom = mat.length-1;
        while(top<=bottom && left<=right){
            for(int i = left; i<=right; i++){
                list.add(mat[top][i]);
            }
            top++;
            for(int i = top; i<=bottom; i++){
                list.add(mat[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i = right; i>=left; i--){
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom; i>=top; i--){
                    list.add(mat[i][left]);
                }
                left++;
            }
        }
        return list; 
    }
}