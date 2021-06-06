
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

        List<Integer> lst = new ArrayList<Integer>();

        lst = preOrder(root,lst);

        return lst;

    }

    private List<Integer> preOrder(TreeNode node,List<Integer> lst){
        if(node!=null){
            lst.add(node.val);
            lst = preOrder(node.left,lst);
            lst = preOrder(node.right,lst);
        }


        return lst;
    }

}