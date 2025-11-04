/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Node leftMost = root;

        while (leftMost != null) {
            Node curr = leftMost;
            Node prev = null; 
            leftMost = null;  

            while (curr != null) {
                if (curr.left != null) {
                    if (prev != null) prev.next = curr.left;
                    else leftMost = curr.left;
                    prev = curr.left;
                }

                if (curr.right != null) {
                    if (prev != null) prev.next = curr.right;
                    else leftMost = curr.right;
                    prev = curr.right;
                }

                curr = curr.next;
            }
        }

        return root;
    }
}
