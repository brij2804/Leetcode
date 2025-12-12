import java.util.ArrayList;

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
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> output = new ArrayList<Integer>();
        preOrder(root,output);
        return output;

    }

    private void preOrder(TreeNode node,List<Integer> output){
        if(node!=null) {
            output.add(node.val);
            preOrder(node.left, output);
            preOrder(node.right, output);
        }
    }

}