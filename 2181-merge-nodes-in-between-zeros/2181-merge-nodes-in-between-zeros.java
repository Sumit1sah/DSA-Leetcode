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
    public ListNode mergeNodes(ListNode head) {
        ListNode read=head.next;
        ListNode write=head;
        int sum=0;
        while(read!=null){
            while(read.val!=0){
                sum=sum+read.val;
                read=read.next;
            }
            write.val=sum;
            write.next=read.next;
            read=read.next;
            write=write.next;
            sum=0;

        }
        return head;
    }
}