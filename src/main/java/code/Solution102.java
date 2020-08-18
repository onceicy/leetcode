package code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new LinkedList<Integer>();
            for (int i = 0; i < size; ++i) {
                TreeNode cur = q.peek();
                q.poll();
                if (cur == null) {
                    continue;
                }
                level.add(cur.val);
                q.offer(cur.left);
                q.offer(cur.right);
            }
            if (!level.isEmpty()) {
                res.add(level);
            }
        }
        return res;
    }
}
