class Solution {
    // Function to merge the arrays.
    public void swap(int a[],int i,int b[],int j){
        int temp=a[i];
        a[i]=b[j];
        b[j]=temp;
    }
    public void mergeArrays(int a[], int b[]) {
      int i=0;
      int j=a.length-1;
      while(i<b.length&& j>=0){
          if(a[j]>b[i]){
              swap(a,j,b,i);
              i++;
              j--;
          }
          else
          j--;
      }
      Arrays.sort(a);
      Arrays.sort(b);
        
    }
}