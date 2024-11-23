class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
     int n = arr.length;
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int a=0,b=0;
        int large=arr[n-1]-k;
        int small=arr[0]+k;
        for (int i = 0; i < n - 1; i++) {
            a = Math.min(small,arr[i+1]-k);
            b = Math.max(large,arr[i]+k); 
            if(a<0){
                continue;
            }
            ans = Math.min(ans, b-a);
        }

        return ans;
    }
}