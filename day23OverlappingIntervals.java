
class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        List<int[]>ans=new ArrayList();
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int start=arr[0][0] , end=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=end){
                end=Math.max(arr[i][1],end);
            }
            else{
                int[] a=new int[]{start,end};
                ans.add(a);
                start=arr[i][0];
                end=arr[i][1];
            }
        }
        int[]a=new int[]{start,end};
        ans.add(a);
        return ans;
    }
}