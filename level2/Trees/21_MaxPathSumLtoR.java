class Solution
{
    public static int maxPathSum(Node root)
    {
        if(root==null){
            return 0;
        }
        // int lf = maxPathSum(root.left);
        // int rf = maxPathSum(root.right);
        // return Math.max(lf,rf)+root.data;
        
        if(root.left!=null && root.right!=null){
        int lf = maxPathSum(root.left);
        int rf = maxPathSum(root.right);
        return Math.max(lf,rf)+root.data;
        }else if(root.left!=null){
             int lf = maxPathSum(root.left);
             return lf+root.data;
        }else if(root.right!=null){
             int rf = maxPathSum(root.right);
             return rf+root.data;
        }
        return root.data;
    }
}