import java.util.ArrayList;

class InOrder {
    static void inorderUtil(Node root, ArrayList<Integer> res) {
        // inorder traversal works on Left Root Right.

        // if root is null then we simply return.
        if (root == null) {
            return;
        }
        // first, we call the recursive function for left subtree.
        inorderUtil(root.left, res);
        // then we store the data at root in a list.
        res.add(root.data);
        // then we call the recursive function for right subtree.
        inorderUtil(root.right, res);
    }
}