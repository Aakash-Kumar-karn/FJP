class Solution {
    public int idx = 0;
    public TreeNode helper(int[] preorder , int lf , int rf){
        if(idx>=preorder.length || preorder[idx]>rf || preorder[idx]<lf){
        return null;
        }
        TreeNode node = new TreeNode(preorder[idx++]);
        node.left= helper(preorder , lf,node.val);
        node.right = helper(preorder, node.val ,rf);
        return node;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int lf= Integer.MIN_VALUE;
        int rf = Integer.MAX_VALUE;
        return helper(preorder,lf,rf);
    }
}