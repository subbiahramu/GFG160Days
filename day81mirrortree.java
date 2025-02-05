

public class day81mirrortree {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code here
        solve(node);
    }
    Node solve(Node node){
        if(node==null){
            return null;
        }
        Node mirrorlft=solve(node.left);
        Node mirrorrht=solve(node.right);
        node.left=mirrorrht;
        node.right=mirrorlft;
        return node;
    }
} 
    

