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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> sortedValues = new ArrayList<>();
        inorder(root, sortedValues);
        return buildBalancedBST(sortedValues, 0, sortedValues.size() - 1);
    }
    private void inorder(TreeNode node, List<Integer> sortedValues) {
        if (node == null) return;
        inorder(node.left, sortedValues);
        sortedValues.add(node.val);
        inorder(node.right, sortedValues);
    }
    private TreeNode buildBalancedBST(List<Integer> nums, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums.get(mid));
        node.left = buildBalancedBST(nums, start, mid - 1);
        node.right = buildBalancedBST(nums, mid + 1, end);
        return node;
    }
}