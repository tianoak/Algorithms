/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        
        ListNode pre = null;
        while(head != null) {
            ListNode tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        
        return pre;
        
    }
}
