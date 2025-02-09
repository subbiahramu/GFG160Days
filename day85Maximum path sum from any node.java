class Solution {
    // MORE SMALL CODE
    int max=Integer.MIN_VALUE;
    int path(Node root)
    {
        if(root==null) return 0;
        int l=Math.max(0,path(root.left));
        int r=Math.max(0,path(root.right));
        max=Math.max(max,root.data+l+r);
        return root.data+Math.max(l,r);
    }
    int findMaxSum(Node node) {
        // your code goes here
        path(node);
        return max;
    }
}