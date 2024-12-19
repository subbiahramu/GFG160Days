class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            int missingElement=arr[mid]-mid-1;
            if(missingElement<k){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return k+start;
    }
}