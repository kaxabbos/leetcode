package main.java.com.leetcode.not;

public class M2_AddTwoNumbers {
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

    static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        ListNode temp = l1;
        while (temp != null) {
            builder1.append(temp.val);
            temp = temp.next;
        }

        temp = l2;
        while (temp != null) {
            builder2.append(temp.val);
            temp = temp.next;
        }

        builder1.reverse();
        builder2.reverse();

        String[] ints = String.valueOf(Integer.parseInt(builder1.toString()) + Integer.parseInt(builder2.toString())).split("");

        temp = new ListNode();
        ListNode head = temp;
        for (int i = ints.length - 1; i >= 0; i--) {
            if (i == 0) {
                head.val = Integer.parseInt(ints[i]);
            } else {
                head.val = Integer.parseInt(ints[i]);
                head.next = new ListNode();
                head = head.next;
            }
        }


        return temp;
    }

    public static void main(String[] args) {

    }

}
