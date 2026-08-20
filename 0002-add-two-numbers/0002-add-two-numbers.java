class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node result list ko easily banane ke liye
        ListNode dummy = new ListNode(0);

        // Current pointer
        ListNode curr = dummy;

        // Carry
        int carry = 0;

        // Jab tak dono lists me koi node hai
        while (l1 != null || l2 != null || carry != 0) {

            // l1 ka digit
            int x = (l1 != null) ? l1.val : 0;

            // l2 ka digit
            int y = (l2 != null) ? l2.val : 0;

            // Addition
            int sum = x + y + carry;

            // Current digit
            int digit = sum % 10;

            // Next carry
            carry = sum / 10;

            // New node banao
            curr.next = new ListNode(digit);

            // curr ko aage badhao
            curr = curr.next;

            // l1 ko aage badhao
            if (l1 != null) {
                l1 = l1.next;
            }

            // l2 ko aage badhao
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        // Dummy ke next se actual answer start hota hai
        return dummy.next;
    }
}