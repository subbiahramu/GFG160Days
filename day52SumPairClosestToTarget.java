class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
       Arrays.sort(arr);
       List<Integer>ans=new ArrayList<>();
       int st=0,end=arr.length-1,close=Integer.MAX_VALUE;
       int sum=0;
       while(st<end){
           sum=arr[st]+arr[end];
           if(Math.abs(sum-target)<close){
               close=Math.abs(sum-target);
               ans.clear();
               ans.add(arr[st]);
               ans.add(arr[end]);
           }
           if(sum>target){
               end--;
           }
           else if(sum<target){
               st++;
           }
           else{
               return ans;
           }
       }
       return ans;
    }
}