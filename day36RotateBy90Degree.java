class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        // code here
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int j=0;j<n;j++){
            int top=0,bottom=n-1;
            while(top<bottom){
                int temp=mat[top][j];
                mat[top][j]=mat[bottom][j];
                mat[bottom][j]=temp;
                top++;
                bottom--;
            }
        }
    }
}