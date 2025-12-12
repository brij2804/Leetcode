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
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> output = new ArrayList<Integer>();
        postOrder(root,output);
        return output;

    }

    private void postOrder(TreeNode node, List<Integer> output){
        if(node!=null){
            postOrder(node.left,output);
            postOrder(node.right,output);
            output.add(node.val);
        }

    }
}