class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n=arr.length;
        int st=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            while(sum>target && st<=i){
                sum-=arr[st];
                st++;
            }
            if(sum==target){
                ArrayList<Integer>res=new ArrayList<>();
               res.add(st+1);
               res.add(i+1);
               return res;
            }
        }
        ArrayList<Integer>res=new ArrayList<>();
        res.add(-1);
        return res;
        
    }
}
