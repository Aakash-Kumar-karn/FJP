class Solution {
    int count = 0 ;
    final int camera = 1 ;
    final int monitored =2 ;
    final int not_monitored = 3;
    
    public int minCameraCover(TreeNode root) {
        int ans  = helper(root);
        if(ans == not_monitored){
            count++;
        }
        return count;
    }
    
    public int helper(TreeNode root){
        if(root==null){
            return monitored;
        }
        int lf = helper(root.left);
        int rf = helper(root.right);
        
        if(lf==not_monitored || rf==not_monitored){
            count++;
            return camera;
        }else if(lf==camera || rf==camera){
            return monitored;
        }else{
            return not_monitored;
        }
        
    }
    
}