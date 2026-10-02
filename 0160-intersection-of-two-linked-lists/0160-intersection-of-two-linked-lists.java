/**
 * Definition for singly-linked list.
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode a=headA;
        ListNode b=headB;
        while(a!=null&&b!=null){
            a=a.next;
            b=b.next;
        }
        if(a==null){
            int bextra=0;
            while(b!=null){
                bextra++;
                b=b.next;
            }
            while(bextra-->0){
                headB=headB.next;
            }
        }
        if(b==null){
            int aextra=0;
            while(a!=null){
                aextra++;
                a=a.next;
            }
            while(aextra-->0){
                headA=headA.next;
            }
        }
        while(headA!=null&&headB!=null){
            if(headA==headB){
                return headA;
            }else{
                headA=headA.next;
                headB=headB.next;
            }
        }
        return null;
    }
}