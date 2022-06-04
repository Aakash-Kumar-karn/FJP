class Solution {
    public int max = Integer.MIN_VALUE;
    public int maxPathSum_RTN(TreeNode root) {
        if(root.left !=null && root.right != null){
            int lf = maxPathSum_RTN(root.left);
            int rf = maxPathSum_RTN(root.right);
            int lf_dash = Math.max(lf,0);
            int rf_dash = Math.max(rf,0);
            int ans = lf_dash+rf_dash+root.val;
            if(ans>max){
                max=ans;
            }
            return Math.max(lf_dash,rf_dash)+root.val;
        }else if(root.left != null){
             int lf = maxPathSum_RTN(root.left);
             int lf_dash = Math.max(lf,0);
             int ans = lf_dash+root.val;
            if(ans>max){
                max=ans;
            }
            return lf_dash+root.val;
        }else if(root.right != null){
            int rf = maxPathSum_RTN(root.right);
             int rf_dash = Math.max(rf,0);
             int ans = rf_dash+root.val;
            if(ans>max){
                max=ans;
            }
            return rf_dash+root.val;
        }else{
            int ans = root.val;
             if(ans>max){
                max=ans;
            }
            return root.val;
        }
    }
        public int maxPathSum(TreeNode root) {
            max = Integer.MIN_VALUE;
            maxPathSum_RTN(root);
            return max;
    }
}
//2nd
class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        maxPathSum_RTN(root);
        return max; 
    }
    public int maxPathSum_RTN(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lf = maxPathSum_RTN(root.left);
        int rf = maxPathSum_RTN(root.right);
        
        int lf_dash = Math.max(0,lf);
        int rf_dash = Math.max(0,rf);
     
        int ans = lf_dash+rf_dash+root.val;
        if(ans>max){
            max=ans;
        }
        return Math.max(lf_dash,rf_dash) + root.val;
    }
}