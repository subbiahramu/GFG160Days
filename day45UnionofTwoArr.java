class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer>res=new HashSet<>();
        for(int i=0;i<a.length+b.length;i++){
            if(i<a.length)
              res.add(a[i]);
            else
                res.add(b[i-a.length]);
        }
        
        return res.size();
    }
}