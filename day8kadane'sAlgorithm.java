class Solution {
    int maxSubarraySum(int[] arr) {
        int maximum=Integer.MIN_VALUE;
        int sum=0;
        for(int num:arr){
            sum+=num;
            if(maximum<sum){
                maximum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maximum;
    }
}