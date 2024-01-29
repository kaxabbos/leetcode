package main.java.com.leetcode.easy;

public class E83_RemoveDuplicatesFromSortedList {
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

    static public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode temp = head;
        ListNode res = new ListNode();

        ListNode res1 = res;
        int index = 0;
        while (temp != null) {
            if (res1.val != temp.val) {
                if (index != 0) {
                    res1.next = new ListNode();
                    res1 = res1.next;
                }
                res1.val = temp.val;
            }
            temp = temp.next;
            index++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] int1 = new int[]{1, 1, 2, 3, 3};

        ListNode list = new ListNode();
        ListNode temp = list;
        for (int i = 0; i < int1.length; i++) {
            temp.val = int1[i];
            if (i != int1.length - 1) {
                temp.next = new ListNode();
                temp = temp.next;
            }
        }

        temp = deleteDuplicates(list);
        while (temp != null) {
            System.out.print(temp.val + ", ");
            temp = temp.next;
        }
    }
}
