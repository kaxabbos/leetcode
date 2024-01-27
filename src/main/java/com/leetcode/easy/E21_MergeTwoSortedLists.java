package main.java.com.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class E21_MergeTwoSortedLists {

    public static class ListNode {
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

    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode res = new ListNode();

        List<Integer> mas = new ArrayList<>();

        while (list1 != null) {
            mas.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            mas.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(mas);

        ListNode temp = res;
        for (int i = 0; i < mas.size(); i++) {
            temp.val = mas.get(i);
            if (i != mas.size() - 1) {
                temp.next = new ListNode();
                temp = temp.next;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] int1 = new int[]{1, 2, 4};
        int[] int2 = new int[]{1, 3, 4};

        ListNode list1 = new ListNode();
        ListNode temp = list1;
        for (int i = 0; i < int1.length; i++) {
            temp.val = int1[i];
            if (i != int1.length - 1) {
                temp.next = new ListNode();
                temp = temp.next;
            }
        }

        ListNode list2 = new ListNode();
        temp = list2;
        for (int i = 0; i < int2.length; i++) {
            temp.val = int2[i];
            if (i != int2.length - 1) {
                temp.next = new ListNode();
                temp = temp.next;
            }
        }

        temp = mergeTwoLists(list1, list2);
        while (temp != null) {
            System.out.print(temp.val + ", ");
            temp = temp.next;
        }
    }
}
