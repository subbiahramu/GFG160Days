class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}