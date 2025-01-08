class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
       Arrays.sort(arr);
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            int st=0,end=i-1;
          while(st<end){
            if(arr[st]+arr[end]>arr[i]){
               count+=end-st;
               end--;
            }
            else{
                st++;
            }
        }
            
        }
        
        return count;
    }
}