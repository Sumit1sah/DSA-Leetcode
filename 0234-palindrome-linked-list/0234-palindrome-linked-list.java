class Solution {

    public ListNode getMidPoint(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode forward = curr.next;

            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        // Empty or single node
        if (head == null || head.next == null) {
            return true;
        }

        // Find middle
        ListNode list2 = getMidPoint(head);

        // Reverse second half
        ListNode head2 = reverseLL(list2);

        // Compare
        ListNode temp1 = head;
        ListNode temp2 = head2;

        while (temp2 != null) {

            if (temp1.val != temp2.val) {
                return false;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
    }
}