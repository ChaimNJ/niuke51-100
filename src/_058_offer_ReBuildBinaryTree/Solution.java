package _058_offer_ReBuildBinaryTree;


import java.util.Arrays;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字
 * 。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        } else {
            return build(pre, 0, pre.length - 1, in, 0, in.length - 1);
        }
    }

    private TreeNode build(int[] pre, int pre_l, int pre_h, int[] in, int in_l, int in_h) {
        if(pre_l>pre_h){
            return null;
        }

        TreeNode node = new TreeNode(pre[pre_l]);
        int index = 0;
        for (int i = in_l; i <=in_h; i++) {
            if(in[i]==pre[pre_l]){
                index=i;
            }
        }
        node.left = build(pre,pre_l+1,pre_l+index-in_l,in,in_l,index-1);
        node.right = build(pre,pre_l+index-in_l+1,pre_h,in,index+1,in_h);
        return node;
    }

    /**简洁写法
     * @param pre
     * @param in
     * @return
     */
    public TreeNode reConstructBinaryTree_1(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        TreeNode node = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            if(node.val==in[i]){
                node.left = reConstructBinaryTree_1(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                node.right = reConstructBinaryTree_1(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return node;
    }
}
