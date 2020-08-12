package code;

import java.util.LinkedList;

public class Solution226 {
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode tmp = queue.poll();
			TreeNode left = tmp.left;
			tmp.left = tmp.right;
			tmp.right = left;
			if (tmp.left!=null) {
				queue.add(tmp.left);
			}
			if (tmp.right!=null) {
				queue.add(tmp.right);
			}	
		}
		return root;
	}
}
