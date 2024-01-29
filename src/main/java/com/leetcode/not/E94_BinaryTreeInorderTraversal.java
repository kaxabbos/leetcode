package main.java.com.leetcode.not;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class E94_BinaryTreeInorderTraversal {
    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> res = new ArrayList<>(path(root));

        return res;
    }

    static public List<Integer> path(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if (root.val == 0) res.add(null);
        else res.add(root.val);

        if (root.left != null) res.addAll(path(root.left));
        if (root.right != null) res.addAll(path(root.right));

        return res;
    }

    public static void main(String[] args) {
        System.out.println(inorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))));
        System.out.println(inorderTraversal(null));
        System.out.println(inorderTraversal(new TreeNode(1)));
    }
}
