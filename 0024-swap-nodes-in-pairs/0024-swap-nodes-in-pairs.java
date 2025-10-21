class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            int l = temp.val;
            temp.val = temp.next.val;
            temp.next.val = l;
            temp = temp.next.next; 
        }
        return head;
    }
}
