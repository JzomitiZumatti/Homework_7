public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prevNumber = null;
        ListNode currentNumber = head;
        ListNode nextNumber;

        while (currentNumber != null) {
            nextNumber = currentNumber.next;
            currentNumber.next = prevNumber;
            prevNumber = currentNumber;
            currentNumber = nextNumber;
        }

        return prevNumber;
    }
}
