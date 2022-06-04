class Solution
{
    public static int maxPathSum(Node root)
    {
        //code here
        if(root==null){
            return 0;
        }
        if(root.left != null && root.right != null){
            int lf = maxPathSum(root.left);
            int rf = maxPathSum(root.right);
            int l_dash = Math.max(0,lf);
            int r_dash = Math.max(0,rf);
            return Math.max(l_dash,r_dash)+root.data;
            
        }else if(root.left != null){
             int lf = maxPathSum(root.left);
              int l_dash = Math.max(0,lf);
              return l_dash+root.data;
        }else if(root.right != null){
             int rf = maxPathSum(root.right);
              int r_dash = Math.max(0,rf);
              return r_dash+root.data;
        }else{
            return root.data;
        }
    }
}