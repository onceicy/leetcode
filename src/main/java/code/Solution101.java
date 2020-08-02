package code;

import java.util.LinkedList;

public class Solution101 {
	public boolean isSymmetric(TreeNode root) {
		if (root == null || (root.left == null && root.right == null)) {
			return true;
		}
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root.left);
		queue.add(root.right);
		while (queue.size() > 0) {
			TreeNode left = queue.removeFirst();
			TreeNode right = queue.removeFirst();
			if (left == null && right == null) {
				continue;
			}
			if (left == null || right == null) {
				return false;
			}
			if (left.val != right.val) {
				return false;
			}
			queue.add(left.left);
			queue.add(right.right);
			queue.add(left.right);
			queue.add(right.left);
		}
		return true;
	}
}
