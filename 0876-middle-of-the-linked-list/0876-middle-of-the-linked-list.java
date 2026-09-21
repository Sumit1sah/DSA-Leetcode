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
    static ListNode solve(ListNode fast,ListNode slow){
        if(fast==null){
            return slow;
        }
        fast=fast.next;
        if(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode ans=solve(fast,slow);
        return ans;
    }
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode ans=solve(fast,slow);
        return ans;
    }
}