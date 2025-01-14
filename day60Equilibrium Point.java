class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int totalSum=0;
        for(int i: arr){
            totalSum+=i;
        }
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            if(currSum==totalSum-currSum-arr[i]){
                return i;
            }
            currSum+=arr[i];
        }
        return -1;
        
    }
}
