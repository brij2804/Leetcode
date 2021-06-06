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
    public int maxDepth(TreeNode root) {
        int depth = 0;
        depth = preOrder(root,depth);
        return depth;
    }

    private int preOrder(TreeNode node,int depth){
        if(node!=null){
            int leftdepth = 0 ;
            leftdepth = preOrder(node.left,leftdepth);
            int rightdepth = 0;
            rightdepth = preOrder(node.right,rightdepth);

            depth = Math.max(leftdepth,rightdepth) +1;
            return depth;

        }else{
            return 0;
        }
    }
}