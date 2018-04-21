package _079_offer_mirroroftree;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        super();
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Soution {

    public void getMirror(TreeNode node) {
        if (node == null || node.left == null && node.right == null) {
            return;
        }
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        if (node.left != null) {
            getMirror(node.left);
        }
        if (node.right != null) {
            getMirror(node.right);
        }
    }

    public void Mirror(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(node!=null||!stack.isEmpty()){
            while(node!=null){
                TreeNode tmp = node.left;
                node.left = node.right;
                node.right = tmp;

                stack.push(node);
                node = node.left;
            }
            if(!stack.isEmpty()){
                node = stack.pop().right;
            }
        }
    }

}
