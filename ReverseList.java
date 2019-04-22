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
        
        // write your code here
        if(head == null || head.next == null)
            return head;
            
        ListNode pre = null;
        ListNode tmp = head.next;
        
        while(head != null) {
            head.next = pre;
            pre = head;
            head = tmp;
            if(tmp == null) break;
            else    tmp = tmp.next;
        }
        
        return pre;
    }
}
