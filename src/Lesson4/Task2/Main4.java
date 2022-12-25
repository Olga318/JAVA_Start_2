package Lesson4.Task2;

import java.util.Stack;


public class Main4 {
    public static void main(String[] args) {
    }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            stack.add(root);
            stack.add(root);
            while (!stack.isEmpty()) {
                TreeNode p = stack.pop();
                TreeNode q = stack.pop();
                if (p == null && q == null) {
                    continue;
                }
                if (p == null|| q == null) {
                    return false;
                }
                if(p.val!=q.val) {
                    return false;
                }
                stack.push(p.left);
                stack.push(q.right);

                stack.push(p.right);
                stack.push(q.left);
            }
            return true;

        }
    }


//    Definition for a binary tree node.
    public class TreeNode {
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
}}



