import java.util.ArrayList;

public class PreOrder {
    static void preOrderUtil(Node root, ArrayList<Integer> res) {
        if (root == null) return;
        res.add(root.data);
        preOrderUtil(root.left, res);
        preOrderUtil(root.right, res);
    }
}
