package main.java.com.leetcode.easy;

public class E206_ReverseLinkedList {
    static public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode res = null;
        int index = 0;

        while (head != null) {
            if (index == 0) {
                res = new ListNode(head.val);
            } else {
                res = new ListNode(head.val, res);
            }
            head = head.next;
            index++;
        }
        return res;
    }

    public static void main(String[] args) {
        reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
    }
}
