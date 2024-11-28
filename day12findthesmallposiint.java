class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int res=1;
        Arrays.sort(arr);
        for(int num:arr){
            if(num==res){
                res++;
            }
        }
     return res;
}}