import java.util.ArrayList;

public class PostOrder {
    static void postOrderUtil(Node root, ArrayList<Integer> res) {
        if (root == null) return;
        postOrderUtil(root.left, res);
        postOrderUtil(root.right, res);
        res.add(root.data);
    }

    public static void main(String[] args) {
        Node test = new Node;
    }
}
