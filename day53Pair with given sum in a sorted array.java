class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int st=0,end=arr.length-1,count=0;
        while(st<end){
            int sum=arr[st]+arr[end];
            if(sum==target){
                int element1=arr[st],element2=arr[end],c1=0,c2=0;
                while(st<=end && arr[st]==element1){
                    st++;
                    c1++;
                }
                while(st<=end && arr[end]==element2){
                    end--;
                    c2++;
                }
                if(element1==element2){
                    count+=(c1*(c1-1))/2;
                }
                else{
                    count+=c1*c2;
                }
            }
            else if(sum>target){
                end--;
            }
            else{
                st++;
            }
        }
        return count;
    }}