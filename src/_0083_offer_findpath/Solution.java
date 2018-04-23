package _0083_offer_findpath;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    private static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        list.clear();
        Stack<TreeNode> stack = new Stack<>();
        int cur = 0;
        findPath_1(root, target, stack, cur);
        return list;
    }

    public static void findPath_1(TreeNode root, int target, Stack<TreeNode> stack, int cur) {

        ArrayList<Integer> l = new ArrayList<>();
        cur += root.val;
        stack.push(root);
        if (root.left == null && root.right == null && cur == target) {
            Iterator<TreeNode> it = stack.iterator();
            while (it.hasNext()) {
                l.add(it.next().val);
            }
            list.add(l);
        }

        if (root.left != null) {
            findPath_1(root.left, target, stack, cur);
        }
        if (root.right != null) {
            findPath_1(root.right, target, stack, cur);
        }
        cur -= root.val;
        stack.pop();
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(10, new TreeNode(5, new TreeNode(4, null, null), new TreeNode(7, null, null)), new TreeNode(12, null, null));
        FindPath(t1, 19);
        System.out.println(list.toString());
    }


}
