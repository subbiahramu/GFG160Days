class Solution {
    static void correctBSTUtil(Node root, Node[] first, Node[] temp, Node[] last,
                               Node[] prev) {
        if (root == null) return;

        correctBSTUtil(root.left, first, temp, last, prev);

        if (prev[0] != null && root.data < prev[0].data) {

            if (first[0] == null) {
                first[0] = prev[0];
                temp[0] = root;
            }

            else
                last[0] = root;
        }

        prev[0] = root;

        correctBSTUtil(root.right, first, temp, last, prev);
    }

    static void correctBST(Node root) {
        Node[] first = {null}, temp = {null}, last = {null}, prev = {null};

        correctBSTUtil(root, first, temp, last, prev);

        if (first[0] != null && last[0] != null)
            swap(first[0], last[0]);
        else if (first[0] != null && temp[0] != null)
            swap(first[0], temp[0]);
    }

    static void swap(Node a, Node b) {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }
}