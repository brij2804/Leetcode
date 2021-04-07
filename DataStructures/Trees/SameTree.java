/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean flag = true;

        flag = preOrder(p,q, flag);

        return flag;
    }

    private boolean preOrder(TreeNode p,TreeNode q, boolean flag){
        if(p==null && q!=null){
            flag = false;
            return flag;
        }
        if(p!=null && q== null){
            flag = false;
            return flag;
        }
        if(p!=null && q!=null){
            if(p.val != q.val){
                flag = false;
                return flag;
            }
            flag = preOrder(p.left,q.left,flag);
            if(!flag){
                return flag;
            }
            flag = preOrder(p.right,q.right,flag);
            if(!flag){
                return flag;
            }
        }
        return flag;
    }
}