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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;
        
        while(curr!=null)
        {
        if(p.val>curr.val && q.val<curr.val || p.val<curr.val &&q.val>curr.val)
            return curr;
        else if(p.val>curr.val && q.val>curr.val)
            curr = curr.right;
            else if(p.val==curr.val && q.val>curr.val)
                return p;
            else if(q.val==curr.val && p.val>curr.val)
                return q;
            else if(p.val == curr.val && q.val<curr.val)
                return p;
            else if(q.val==curr.val && p.val<curr.val)
                return q;
            else if(p.val<curr.val && q.val<curr.val)
                curr = curr.left;
            }
        return curr;
            
        
    }
}
