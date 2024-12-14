class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        int k=-1;
        for(int i=0;i<arr.length;i++){
            if(key!=arr[i]){
                continue;
            }
            else{
                return i;
            }
        }
        return k;
    }
}