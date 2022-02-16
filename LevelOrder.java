import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        queue.add(node);
        while (queue.size() > 0) {
            Node tmp = queue.poll();
            ans.add(tmp.data);
            if (tmp.left != null) queue.add(tmp.left);
            if (tmp.right != null) queue.offer(tmp.right);
        }
        return ans;
    }   
}
