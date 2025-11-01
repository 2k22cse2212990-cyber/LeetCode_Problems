/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        
        while (set.contains(head.val)) head = head.next;

        ListNode newHead = new ListNode(0);
        ListNode currHead = newHead;

        while (head != null) {
            if (!set.contains(head.val)) {
                currHead.next = head;
                currHead = currHead.next;
            } 
            head = head.next;
        }
        currHead.next = null;
        return newHead.next;
    }
}