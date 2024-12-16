class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int d=a.length,e=b.length;
        int []c=new int[d+e];
        for(int i=0;i<d;i++){
            c[i]=a[i];
        }
        for(int j=0;j<e;j++){
            c[d+j]=b[j];
        }
        Arrays.sort(c);
        return c[k-1];
    }
}