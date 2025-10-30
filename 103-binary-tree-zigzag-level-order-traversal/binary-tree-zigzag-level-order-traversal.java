/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Deque<TreeNode> dq = new LinkedList<>();
        dq.offer(root);
        boolean reverse = false;

        while (!dq.isEmpty()) {
            List<Integer> currRes = new ArrayList<>();
            int levelSize = dq.size();
            for (int i = 0; i < levelSize; i++) {
                if (!reverse) {
                    TreeNode node = dq.poll();
                    currRes.add(node.val);
                    if (node.left != null) dq.addLast(node.left);
                    if (node.right != null) dq.addLast(node.right);
                } else {
                    TreeNode node = dq.pollLast();
                    currRes.add(node.val);
                    // Add right first, then left, both at the front
                    if (node.right != null) dq.addFirst(node.right);
                    if (node.left != null) dq.addFirst(node.left);
                }
            }

            reverse = !reverse;
            res.add(currRes);
        }

        return res;
    }
}