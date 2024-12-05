class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void swap(int[]arr,int a,int b){
        int temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
    public void sort012(int[] arr) {
        // code here
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
        if(arr[mid]==0){
            swap(arr,low,mid);
            low++;
            mid++;
        }
        else if(arr[mid]==1){
            mid++;
        }
        else{
            swap(arr,high,mid);
            high--;
        }
    }}}