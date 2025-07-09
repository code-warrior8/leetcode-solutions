class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addHelper(l1, l2, 0);
    }

    private ListNode addHelper(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) return null;

        int sum = carry;
        if (l1 != null) sum += l1.val;
        if (l2 != null) sum += l2.val;

        ListNode result = new ListNode(sum % 10);
        result.next = addHelper(
            l1 != null ? l1.next : null,
            l2 != null ? l2.next : null,
            sum / 10
        );
        return result;
    }
}
