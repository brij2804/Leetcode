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

        List<Integer> lst = new ArrayList<Integer>();
        lst = postOrder(root,lst);
        return lst;

    }

    private List<Integer> postOrder(TreeNode node, List<Integer> lst){
        if(node!=null){
            lst = postOrder(node.left,lst);
            lst = postOrder(node.right,lst);
            lst.add(node.val);
        }
        return lst;

    }
}