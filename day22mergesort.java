class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergeSort(arr,0,arr.length-1);
    }
    static int mergeSort(int[] arr,int le,int ri){
        if(le>=ri){
            return 0;
        }
        int mid=(le+ri)/2;
        int leftinversion=mergeSort(arr,le,mid);
        int rightinversion=mergeSort(arr,mid+1,ri);
        int m=merge(arr,le,mid,ri);
        return leftinversion+rightinversion+m;
    }
    static int merge(int[] arr,int le,int mid,int ri){
        int j=mid+1;
        int count=0;
        for(int i=le;i<=mid;i++){
            while(j<=ri&&arr[i]>arr[j]){
                j++;
            }
            count+=j-(mid+1);
        }
        Arrays.sort(arr,le,ri+1);
        return count;
        
    }
}