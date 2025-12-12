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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<Integer>();
        inOrder(root,output);
        return output;
    }

    public void inOrder(TreeNode root,List<Integer> output){
        if(root!=null){
            inOrder(root.left,output);
            output.add(root.val);
            inOrder(root.right,output);
        }
    }
}