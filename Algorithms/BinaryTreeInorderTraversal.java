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
        List<Integer> lst = new ArrayList<Integer>();
        lst = inOrder(root,lst);
        return lst;
    }

    public List<Integer> inOrder(TreeNode root,List<Integer> lst){
        if(root!=null){
            lst = inOrder(root.left,lst);
            lst.add(root.val);
            lst = inOrder(root.right,lst);
        }
        return lst;
    }
}