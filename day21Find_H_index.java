class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        int len=citations.length;
        int[] arr=new int[len+1];
        for(int i:citations){
           if(i>=len){
               arr[len]++;
           }
           else{
               arr[i]++;
           }
        }
        int count=0;
        for(int i=len;i>=0;i--){
            count+=arr[i];
            if(count>=i){
                return i;
            }
        }
        return 0;
    }
}