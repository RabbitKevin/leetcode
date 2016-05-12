/*
    Iterative solution
*/
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while((p.val < root.val && q.val < root.val) || (p.val> root.val && q.val > root.val)) {
            if(p.val < root.val) {
                root = root.left;
            }
            else {
                root = root.right;
            }
        }
        return root;
    }
}
/*
    Recursion
*/
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > q.val && root.val > p.val) return lowestCommonAncestor(root.left, p, q);
        if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}
