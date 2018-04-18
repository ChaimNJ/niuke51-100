package _072_offer_hasSubTree;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val,TreeNode left,TreeNode right) {
        super();
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
public class Soution {
    public static void main(String[] args) {

    }
    public static boolean hasSubTree(TreeNode p,TreeNode s){
        if(p==null||s==null){
            return false;
        }
        boolean result = false;
        if(p.val==s.val){
            result=judge(p,s);
        }
        if(!result){
            result=hasSubTree(p.left,s);
        }
        if(!result){
            result=hasSubTree(p.right,s);
        }
        return result;
    }

    private static boolean judge(TreeNode p, TreeNode s) {
        if(s==null){
            return true;
        }
        if(p==null){
            return false;
        }
        if(p.val!=s.val){
            return false;
        }
        return judge(p.left,s.left)&&judge(p.right,s.right);

    }
}
