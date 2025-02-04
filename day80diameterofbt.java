class Solution {
    int diameter = 0;

    public int diameter(Node root) {
        solve(root);
        return diameter;
    }

     int solve(Node node) {
        if (node == null) return 0;
        
        int leftHeight = solve(node.left);
        int rightHeight = solve(node.right);

        // Update the global diameter
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return height of current subtree
        return Math.max(leftHeight, rightHeight) + 1;
    }}